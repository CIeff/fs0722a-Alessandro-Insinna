import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';



@Component({
  selector: 'app-log-in',
  templateUrl: './log-in.component.html',
  styleUrls: ['./log-in.component.scss']
})
export class LogInComponent implements OnInit {

  constructor(private authSrv:AuthService, private router:Router) { }

  ngOnInit(): void {
  }

  login(f:NgForm){
    this.authSrv.login(f.value).subscribe((res)=>{
      this.router.navigate(['/homeRouting'])
    })
  }

  submit(){

  }

}
