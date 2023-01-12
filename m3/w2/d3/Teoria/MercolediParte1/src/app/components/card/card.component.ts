import { Component, OnInit, ViewChild, OnDestroy } from '@angular/core';
import { ChildComponent } from '../child/child.component';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss']
})
export class CardComponent implements OnInit , OnDestroy{

  @ViewChild(ChildComponent, {static:true}) child!:ChildComponent;

  constructor() { }

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
    console.log("ngOnDestroy attivato")
    alert("scaricamento del component")
  }
}
