import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'MercolediParte1';

  users=[
    {
      nome:"Mario",
      cognome:"Rossi"
    },
    {
      nome:"Aldo",
      congome:"Bianchi"
    },
    {
      nome:"Anna",
      cognome:"Verdi"
    },
    {
      nome:"Maria",
      cognome:"Neri"
    },
    {
      nome:"Geppetto",
      cognome:"Del Prete"
    }
  ]
}
