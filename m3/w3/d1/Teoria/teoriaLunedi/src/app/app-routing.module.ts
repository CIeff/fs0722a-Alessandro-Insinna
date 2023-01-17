import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UtentiComponent } from './components/utenti/utenti.component';
import { UtenteComponent } from './components/utente/utente.component';

const routes: Routes = [
  {
    path:"utenti",
    component:UtentiComponent
  },
  {
    path:"utente",
    component:UtenteComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
