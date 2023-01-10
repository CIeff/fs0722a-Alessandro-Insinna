import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})

export class LogService {

  constructor() { }

  logStatusChange(newStatus:string){
    console.log(`Nuovo stato per l'utente: ${newStatus}`)
  }
}
