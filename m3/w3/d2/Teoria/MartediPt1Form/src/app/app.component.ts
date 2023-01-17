import { Component, ViewChild } from '@angular/core';
import { NgForm } from "@angular/forms";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'MartediPt1Form';
  stampa:boolean=false;

  @ViewChild("form", {static:true}) form!:NgForm;

  userForm={
    defUserName:"",
    email:"",
    question:""
  }

  generi=[
    {
      label:"uomo",
      value:"uomo"
    },
    {
      label:"donna",
      value:"donna"
    }
  ]

  risposta="";

  user:any={
    username:"",
    email:"",
    secret:"",
    sesso:"",
    risposta:""
  }

  ngOnInit():void{
    this.form.statusChanges?.subscribe(status=>{
      console.log("stato del form ",status)
    })
  }

  generateUsername(){
    this.form.form.patchValue({
      userInfo:{
        email:"abc@cde.fgh",
        username:"abc"
      }
    })
  }

  submit(){
    console.log("form inviato: ", this.form)
    this.user.username=this.form.value.userInfo.username;
    this.user.email=this.form.value.userInfo.email;
    this.user.secret=this.form.value.userInfo.secret;
    this.user.sesso=this.form.value.userInfo.sesso;
    this.user.risposta=this.form.value.userInfo.risposta;
    this.stampa=true;

    this.form.reset();
  }

}









//quando un'instanza associata a viewchild emette dei valori viewchild li riceve
