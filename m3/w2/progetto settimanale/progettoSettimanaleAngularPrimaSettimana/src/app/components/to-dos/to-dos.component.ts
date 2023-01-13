import { Component, OnInit } from '@angular/core';
import { ServiceTodoService } from 'src/app/service/service-todo.service';
import { Task } from 'src/app/interface/task.interface';


@Component({
  selector: 'app-to-dos',
  templateUrl: './to-dos.component.html',
  styleUrls: ['./to-dos.component.scss']
})
export class ToDosComponent implements OnInit {


  constructor(private tdSrv:ServiceTodoService,) { }

  tasksTd:any=this.getTasks()
  //tasksTd:any;
  newtask:any;


  ngOnInit(): void {

    //this.tdSrv.getTaskAsync().then((p)=>{
    //  this.tasksTd=p
    //})

  }

  getTasks(){
    setTimeout(() =>{
      this.tasksTd=this.tdSrv.getTasks();
   },2000)
 }

 taskDone(t:Task,id:number){
  setTimeout(() =>{
    t.id==id?t.completed=true:t.completed=false;
    console.log(t.completed)
  },2000)
 }

 addTask(t:any){
  setTimeout(()=>{
    this.tdSrv.createTask(t);
  },2000)
}

clear(){
  this.newtask="";
}


/*
  getTasks2(){
    this.tdSrv.getTasks().then((res)=>this.tasksTd=res)
  }
*/

/*
addTaskAsync(t:string){
  this.tdSrv.addTaskAsync(t,(res:any)=>{this.tasksTd=res})
}
*/
}
