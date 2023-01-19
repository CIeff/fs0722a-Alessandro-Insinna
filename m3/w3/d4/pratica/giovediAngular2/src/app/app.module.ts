import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { ActiveComponent } from './active/active.component';
import { InactiveComponent } from './inactive/inactive.component';
import { PostCardComponent } from './post-card/post-card.component';
import { UsersComponent } from './users/users.component';
import { UserCardComponent } from './user-card/user-card.component';
import { DettagliComponent } from './dettagli/dettagli.component';
import { SfondoDirective } from './sfondo.directive';
import { MaiuscoloPipe } from './maiuscolo.pipe';
import { LogInComponent } from './auth/log-in/log-in.component';
import { SignUpComponent } from './auth/sign-up/sign-up.component';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    ActiveComponent,
    InactiveComponent,
    PostCardComponent,
    UsersComponent,
    UserCardComponent,
    DettagliComponent,
    SfondoDirective,
    MaiuscoloPipe,
    LogInComponent,
    SignUpComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
