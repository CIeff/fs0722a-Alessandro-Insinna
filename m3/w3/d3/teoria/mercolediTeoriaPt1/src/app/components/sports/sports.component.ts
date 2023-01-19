import { Component, OnInit } from '@angular/core';
import { Sport, SportsServiceService } from './sports-service.service';
import { catchError } from 'rxjs/internal/operators/catchError';



@Component({
  selector: 'app-sports',
  templateUrl: './sports.component.html',
  styleUrls: ['./sports.component.scss']
})
export class SportsComponent implements OnInit {

  sports:Sport[]=[];

  constructor(private ss:SportsServiceService) { }

  ngOnInit(): void {
    //this.ss.getSports().subscribe((res)=>{
     // if(!res){
     //   //il token non è stato trovato quindi ritorna undefined
      //  this.sports=[{
      //    id:0,
       //   nome:"ERRORE"
       // }]
     //} else{
     //   res.subscribe((s)=>{
     //     this.sports=s
     //   })
    //  }
  //  })


  //importante usare il catchError nella pipe perchè il token
  //è aggiunto dall'interceptor in base al login se il token
  //non dovesse essere inserito correttamente allora l'erorre
  //ci arriva dalla "res" qui sotto
  this.ss.getSports().pipe(catchError((err)=>{
    console.log(err);
    this.sports=[{id:0,nome:"ERRORE"}]

    throw err
  })).subscribe((res)=>{
    this.sports=res
    console.log(this.sports);
  })




  }

}
