import { Component, OnInit, Input, OnChanges, DoCheck, AfterContentInit, AfterContentChecked, AfterViewInit, AfterViewChecked, OnDestroy, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-user-info',
  templateUrl: './user-info.component.html',
  styleUrls: ['./user-info.component.scss']
})
export class UserInfoComponent implements OnInit, OnChanges, DoCheck, AfterContentInit, AfterContentChecked, AfterViewInit, AfterViewChecked, OnDestroy {

  constructor() { }

  @Input() user: any;

  ngOnInit(): void {
    console.log("ngOnInit attivato")
  }

  ngOnChanges(changes: SimpleChanges): void {
    console.log("ngOnChanges attivato")
  }

  ngDoCheck(): void {
    console.log("ngDoCheck attivato")
  }

  ngAfterContentInit(): void {
    console.log("ngAfterContentInit attivato")
  }

  ngAfterContentChecked(): void {
    console.log("ngAfterContentChecked attivato")
  }

  ngAfterViewInit(): void {
    console.log("ngAfterViewInit attivato")
  }

  ngAfterViewChecked(): void {
    console.log("ngAfterViewChecked attivato")
    console.log("====================================")
  }

  ngOnDestroy(): void {
    console.log("ngOnDestroy attivato")
    alert("scaricamento del component")
  }
}
