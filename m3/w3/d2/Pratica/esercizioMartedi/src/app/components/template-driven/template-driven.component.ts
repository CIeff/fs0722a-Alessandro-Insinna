import { Component, OnInit, ViewChild } from '@angular/core';
import { NgForm } from "@angular/forms";

@Component({
  selector: 'app-template-driven',
  templateUrl: './template-driven.component.html',
  styleUrls: ['./template-driven.component.scss']
})
export class TemplateDrivenComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
    this.form.statusChanges?.subscribe(status=>{
      console.log("Template-Driven (status)", status)
    })
  }

  @ViewChild('form', {static:true}) form!:NgForm;

  user={
    nome:"",
    alterEgo:"",
    nemico:"",
    pianeta:"",
    debolezza:"",
    superPotere:""
  }

  submit(){
    console.log("form inviato: ", this.form);


    this.user.nome=this.form.value.user.nome;
    this.user.alterEgo=this.form.value.user.alterEgo;
    this.user.nemico=this.form.value.user.nemico;
    this.user.pianeta=this.form.value.user.pianeta;
    this.user.debolezza=this.form.value.user.debolezza;
    this.user.superPotere=this.form.value.user.superPotere;
    console.log("form", this.form.value.user)

    this.form.reset();
  }

}
