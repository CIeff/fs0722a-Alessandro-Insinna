import { Component, OnInit } from '@angular/core';
import { UsersService } from 'src/app/service/users.service';
import { User } from 'src/app/interface/user.interface';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.scss']
})
export class UsersComponent implements OnInit {

  users:User[]=this.userSrv.getUsers();

  constructor(private userSrv:UsersService) { }

  ngOnInit(): void {
  }

}
