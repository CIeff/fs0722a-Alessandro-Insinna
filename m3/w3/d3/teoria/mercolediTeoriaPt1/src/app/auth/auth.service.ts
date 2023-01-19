import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { JwtHelperService } from '@auth0/angular-jwt';
import { BehaviorSubject, throwError } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';


export interface SignupData{
  name:string,
  surname:string,
  email:string,
  password:string
}

export interface LoginData{
  email:string,
  password:string
}

export interface AuthData{
  accessToken:string,
  user:{
    email:string,
    id:number,
    name:string,
    surname:string
  }
}

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  jwtHelper=new JwtHelperService();
  URL='http://localhost:4201';

  private authSubject= new BehaviorSubject<null|AuthData>(null);    //esegue next -> segnala ai subscribers di eseguire la loro callback "notifica (modo asincrono di dire "ora fai qualcosa")"
  user$=this.authSubject.asObservable(); //"$" -> observable (oggetto su cui fare subscribe nei components per reagire ai next delle subject)
  isLoggedIn$=this.user$.pipe(map(user=>!!user)) //"!!" -> presenza o meno del parametro user (torna la variabile booleana ) (true o false) (per la verifica)

  autoLogOutTimer:any;

  //pipe ritorna un observable ed aggiunge operazioni in coda
  //nell'autentificazione usa "BehaviorSubject" perchè parte con un valore e non da problemi


  constructor(private http:HttpClient, private router:Router) {
    this.restoreUser();
   }

   login(data:LoginData){
    return this.http.post<AuthData>(`${this.URL}/login`, data).pipe(tap((data)=>{

      this.authSubject.next(data);                                                              //segnalare a tutti i subscribers la riuscita del cambiamento (modifica alla subject)

      localStorage.setItem('user', JSON.stringify(data));                                       //salvataggio del token  (serve per auto log-in)

      const expirationDate= this.jwtHelper.getTokenExpirationDate(data.accessToken) as Date;    //data di scadenza del token
      this.autoLogOut(expirationDate);                                                          //auto log-out
    }),
    catchError(this.errors)
    );
   }


   signUp(data:SignupData){
    return this.http.post(`${this.URL}/register`, data).pipe(catchError(this.errors));          //pipe col catch error ottima pratica da portarsi dietro (da mettere ovunque praticamente)
   }

   logOut(){
    this.authSubject.next(null);
    this.router.navigate(['/login']);
    localStorage.removeItem('user');

    if(this.autoLogOutTimer){
      clearTimeout(this.autoLogOutTimer);
    }
   }

   autoLogOut(expirationDate:Date){
    const expMs=expirationDate.getTime() -new Date().getTime();
    this.autoLogOutTimer=setTimeout(()=>{
      this.logOut();
    }, expMs);
   }

   restoreUser(){
    const userJson=localStorage.getItem('user');
    if (!userJson){
      return;
    }
    const user: AuthData= JSON.parse(userJson);

    if (this.jwtHelper.isTokenExpired(user.accessToken)){
      return;
    }
    this.authSubject.next(user);

    const expirationDate= this.jwtHelper.getTokenExpirationDate(user.accessToken) as Date;
    this.autoLogOut(expirationDate);
   }

   private errors(err:any){
    switch(err.error){
      case "Email and password are required":
        return throwError('Email e password sono obbligatorie');
        break;

        case "Email already exists":
          return throwError('Utente già registrato');
          break;

          case "Email format is invalid":
            return throwError('Email scritta male');
            break;

            case "Cannot find user":
              return throwError('Utente non esiste');
              break;

              default:
                return throwError('Errore nella chiamata');
    }
   }


}
