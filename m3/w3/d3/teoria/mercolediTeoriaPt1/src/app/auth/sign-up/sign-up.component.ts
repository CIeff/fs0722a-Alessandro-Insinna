import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.scss']
})
export class SignUpComponent implements OnInit {

  constructor(private as:AuthService, private r:Router) { }

  ngOnInit(): void {
  }

  register(f:NgForm){
    console.log(f.value);
    this.as.signUp(f.value).subscribe(()=>{
     this.r.navigate(["login"])
    })
  }

}
