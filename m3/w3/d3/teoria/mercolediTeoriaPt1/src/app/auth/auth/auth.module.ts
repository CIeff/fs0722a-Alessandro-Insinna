import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LogInComponent } from '../log-in/log-in.component';
import { SignUpComponent } from '../sign-up/sign-up.component';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { TokenInterceptor } from '../token.interceptor';
import { HTTP_INTERCEPTORS } from '@angular/common/http';
import { AuthGuardGuard } from '../auth-guard.guard';




@NgModule({
  declarations: [
    LogInComponent,
    SignUpComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    RouterModule.forChild([
      {
        path:"login",
        component:LogInComponent
      },
      {
        path:"signup",
        component:SignUpComponent
      }
    ])
  ],
  providers:[
    {
      provide:HTTP_INTERCEPTORS,
      useClass:TokenInterceptor,
      multi:true
    }
  ]
})
export class AuthModule { }
