import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { ToDosComponent } from './components/to-dos/to-dos.component';
import { CompletedComponent } from './components/completed/completed.component';
import { ColoraTaskDirective } from './directive/colora-task.directive';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    ToDosComponent,
    CompletedComponent,
    ColoraTaskDirective
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
