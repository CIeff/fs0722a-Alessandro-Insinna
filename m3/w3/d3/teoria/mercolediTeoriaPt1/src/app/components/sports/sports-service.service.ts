import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AuthService } from 'src/app/auth/auth.service';
import { take, map, catchError } from 'rxjs/operators';


export interface Sport{
  nome:string,
  id:number
}


@Injectable({
  providedIn: 'root'
})




export class SportsServiceService {


  getSports(){
    //dobbiamo leggere il token
    //let token=localStorage.getItem('token'); (modo alternativo)
    //if(!token) return  (get item può dare null)

    //usare la subject per leggere il token visto che nel service di auth setta nel localstorage quando avviene il login
    let token="";
    //this.authSrv.isLoggedIn$.subscribe((res)=>{
     // if(res){
       // token=localStorage.getItem('token')!
     // }
    //})

    //this.authSrv.user$.subscribe((res)=>{
     // if(res){
      //  token=res.accessToken
     // }
    //})

    /*this.authSrv.user$.pipe(take(1),map((res)=>{
      if(res){
        let headers={ //proprietà come stringhe
          "authorization": `bearer ${res.accessToken}`
        }
        return this.http.get<Sport[]>('http://localhost:4201',{headers:headers})
      }else{
        return undefined
      }
    }))*/
    return this.http.get<Sport[]>('http://localhost:4201/sports').pipe(catchError((err)=>{
      console.log(err);
      throw err
    }))



  }

  constructor(private http:HttpClient,private authSrv:AuthService) { }
}
