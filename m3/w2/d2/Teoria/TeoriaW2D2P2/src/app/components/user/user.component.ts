import { Component, OnInit } from '@angular/core';
import { UsersService } from 'src/app/service/users.service';
import { User } from 'src/app/interface/user.interface';
import { ActivatedRoute } from '@angular/router';
import { Params } from '@angular/router';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.scss']
})
export class UserComponent implements OnInit {

  user!:User | undefined;
  sub!:Subscription;

  constructor(private userSrv:UsersService, private router:ActivatedRoute) { }

  ngOnInit(): void {
    this.sub=this.router.params.subscribe((params: Params)=>{
      const id=+params["id"];
      this.user=this.userSrv.getUser(id);
    })
  }

  ngOnDestroy():void{
    this.sub.unsubscribe;
  }

}
