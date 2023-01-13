import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ToDosComponent } from './components/to-dos/to-dos.component';
import { CompletedComponent } from './components/completed/completed.component';

const routes: Routes = [
  {
    path:"",
    component:ToDosComponent
  },
  {
    path:"completed",
    component:CompletedComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
