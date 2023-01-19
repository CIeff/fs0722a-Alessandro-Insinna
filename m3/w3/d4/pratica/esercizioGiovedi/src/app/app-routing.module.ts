import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthGuardGuard } from './auth/auth-guard.guard';

const routes: Routes = [
  {
    path:'users', loadChildren:()=> import ('./components/users/users-module/users-module-routing.module').then(m=>m.UsersModuleRoutingModule),
    canActivate:[AuthGuardGuard]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
