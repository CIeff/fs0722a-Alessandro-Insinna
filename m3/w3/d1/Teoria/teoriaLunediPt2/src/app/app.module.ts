import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS} from "@angular/common/http";
import { AuthInterceptor } from './interceptor/auth.interceptor';
import { LogInterceptorInterceptor } from './interceptor/log-interceptor.interceptor';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [
   {
      provide:HTTP_INTERCEPTORS,
      useClass: AuthInterceptor,
      multi:true
   },
   {
      provide:HTTP_INTERCEPTORS,
      useClass:LogInterceptorInterceptor,
      multi:true
   }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
