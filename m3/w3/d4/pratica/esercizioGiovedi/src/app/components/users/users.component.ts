import { Component, OnInit } from '@angular/core';
import { User } from './user.interface';
import { AuthServiceService } from 'src/app/auth/auth-service.service';
import { HttpClient } from '@angular/common/http';
import { catchError } from 'rxjs/operators'

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.scss']
})
export class UsersComponent implements OnInit {

  constructor(private authSrv:AuthServiceService, private http:HttpClient) { }

  users:User[]=[];

  ngOnInit(): void {

      this.http.get<User[]>(`${this.authSrv.URL}/users`).pipe(catchError((err)=>{
        console.log(err);
        this.users=[{id:0,name:"ERRORE",email:""}]
        throw err
      })).subscribe((res)=>{
        return this.users=res

    })


  }


}
