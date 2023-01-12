import { Component, OnInit, Input } from '@angular/core';
import { User } from 'src/app/interface/user';

@Component({
  selector: 'app-user-card',
  templateUrl: './user-card.component.html',
  styleUrls: ['./user-card.component.scss']
})
export class UserCardComponent implements OnInit {

  @Input("data") element!:User;

  constructor() { }

  ngOnInit(): void {
  }

}
