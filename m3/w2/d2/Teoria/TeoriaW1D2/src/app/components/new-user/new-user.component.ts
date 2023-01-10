import { Component, OnInit } from '@angular/core';
import { UsersService } from 'src/app/service/users.service';

@Component({
  selector: 'app-new-user',
  templateUrl: './new-user.component.html',
  styleUrls: ['./new-user.component.scss']
})
export class NewUserComponent implements OnInit {

  name!:string;

  constructor(private userSrv:UsersService) { }

  ngOnInit(): void {
  }

  onNewUser(nome:string){
    if (nome!=undefined && (nome.trim()).length>0){
    this.userSrv.createUser(nome);
  }
  }

}
