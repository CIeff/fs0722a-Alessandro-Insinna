import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule } from '@angular/router';
import { SportsComponent } from '../sports.component';
import { HttpClientModule } from '@angular/common/http';

const routes: Routes=[
  {
    path:"",
    component:SportsComponent
  }
]

@NgModule({
  declarations: [
    SportsComponent
  ],
  imports: [
    CommonModule,
    HttpClientModule,
    RouterModule.forChild(routes)
  ]
})
export class SportsModuleModule { }
