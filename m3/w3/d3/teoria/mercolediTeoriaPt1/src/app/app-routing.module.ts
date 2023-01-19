import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { SportsModuleModule } from './components/sports/sports-module/sports-module.module';
import { AuthGuardGuard } from './auth/auth-guard.guard';

const routes: Routes = [
  {
    path: 'homeRouting', loadChildren: () => import('./components/home/home-routing/home-routing.module').then(m => m.HomeRoutingModule),
  },
  {
    path:"",
    component:HomeComponent
  },
  {
    path:"sports",
    loadChildren:()=>{
      return import('./components/sports/sports-module/sports-module.module')
      .then((m)=>{return m.SportsModuleModule})

    },
    canActivate:[AuthGuardGuard]

  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
