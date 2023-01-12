import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { User } from 'src/app/interface/user';


@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.scss']
})
export class UserFormComponent implements OnInit {

  @Output() onManCreated= new EventEmitter<User>();
  @Output() onWomanCreated= new EventEmitter<User>();

  newName=" ";
  newSurname=" ";
  newEta=0;

  constructor() { }

  onAddMan(){
    this.onManCreated.emit({name:this.newName,surname:this.newSurname,sex:"Uomo",eta:this.newEta});
  }

  onAddWoman(){
    this.onWomanCreated.emit({name:this.newName,surname:this.newSurname,sex:"Donna",eta:this.newEta});
  }

  ngOnInit(): void {
  }

}
