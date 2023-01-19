import { Component, OnInit } from '@angular/core';
import { AuthService } from 'src/app/auth/auth.service';

@Component({
  selector: 'app-prova',
  templateUrl: './prova.component.html',
  styleUrls: ['./prova.component.scss']
})
export class ProvaComponent implements OnInit {

  logged=false;

  constructor(private authSrv:AuthService) { }

  ngOnInit(): void {
    this.authSrv.isLoggedIn$.subscribe((l)=>{
      this.logged=l
    })
  }

}
