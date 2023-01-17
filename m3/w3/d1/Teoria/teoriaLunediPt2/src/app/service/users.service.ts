import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../interface/user.interface';
import { map } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class UsersService {

  constructor(private http:HttpClient) { }

  get(){
   return this.http.get<{data:User[]}>("https://reqres.in/api/users").pipe(map(ris=>ris.data));
  }

  post(newUser:Partial<User>){
   return this.http.post<User>("https://reqres.in/api/users", newUser)
  }

  delete(id:number){
   return this.http.delete(`https://reqres.in/api/users/${id}`)
  }


}
