import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ColoraDirective } from './directives/colora.directive';
import { ComparsaDirective } from './directives/comparsa.directive';

@NgModule({
  declarations: [
    AppComponent,
    ColoraDirective,
    ComparsaDirective
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
