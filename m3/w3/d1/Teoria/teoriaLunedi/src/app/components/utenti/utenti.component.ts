import { Component, OnInit } from '@angular/core';
import { Observable, Subscription } from 'rxjs';
import { map } from 'rxjs/operators';



@Component({
  selector: 'app-utenti',
  templateUrl: './utenti.component.html',
  styleUrls: ['./utenti.component.scss']
})
export class UtentiComponent implements OnInit {

  sub!:Subscription;
  conta:number=0;

  constructor() { }

  ngOnInit(): void {

    const intervallo= new Observable(observer=>{
      let count=0;
      setInterval(()=>{
        observer.next(count);
        if(count===5) {observer.complete(); console.log("observer completato")}
        if(count>3) {observer.error(new Error("Count è troppo grande"))}
        count++
      },1000)
    });

    this.sub=intervallo.pipe(map((conteggio)=>{   //mappo observable
      this.conta=Number(conteggio);               //incremento conteggio con valore observable
      return `siamo al numero ${conteggio}`
    })).subscribe(numero=>{                       //sottoscrivo l'observable
      console.log(numero);
    },(error)=>{                                  //in caso di errore
      console.log(error);                         //console.log ma non sto bloccando il flusso
      alert(error)
    },()=>{
      console.log("observable completato")       //al completamento dell'observable, stampo
    });

  }

  ngOnDestroy():void{
    this.sub.unsubscribe();
    console.log("observable scaricato");
  }


}
