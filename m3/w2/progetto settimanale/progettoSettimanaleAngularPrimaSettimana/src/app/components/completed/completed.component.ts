import { Component, OnInit } from '@angular/core';
import { ServiceTodoService } from 'src/app/service/service-todo.service';

@Component({
  selector: 'app-completed',
  templateUrl: './completed.component.html',
  styleUrls: ['./completed.component.scss']
})
export class CompletedComponent implements OnInit {

  constructor(private tdSrv:ServiceTodoService) { }

  tasksTd:any=this.getTasks();


  ngOnInit(): void {

  }


  getTasks(){
    setTimeout(() =>{
      this.tasksTd=this.tdSrv.getTasks();
   },2000)
 }

 removeTask(id:number){
  setTimeout(()=>{
    this.tasksTd=this.tdSrv.removeTask(id)
  },2000)
 }

}
