import { Injectable } from '@angular/core';
import { User } from '../interface/user.interface';

@Injectable({
  providedIn: 'root'
})
export class UsersService {

  private users:User[]=[
    {
      id:1,
      nome:"Riccardo",
      cognome:"Damiani",
      email:"riccardo@damiani.com"
    },
    {
      id:2,
      nome:"Roberta",
      cognome:"Cavalli",
      email:"roberta@cavalli.com"
    },
    {
      id:3,
      nome:"Dino",
      cognome:"Iacono",
      email:"dino@iacono.com"
    }
  ]

  constructor() { }

  getUsers(){
    return this.users;
  }

  getUser(idUser:number){
    return this.users.find((user)=>user.id===idUser);
  }

}
