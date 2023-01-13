import { Injectable } from '@angular/core';
import { Task } from '../interface/task.interface';

@Injectable({
  providedIn: 'root'
})
export class ServiceTodoService {


  tasks:Task[]=[];

  constructor() { }

  ngOnInit(): void {
  }

  getTasks(){
      console.log(this.tasks)
      return this.tasks
  }

  createTask(t:any){
    this.tasks.push({
      id:this.tasks.length+1,
      completed:false,
      title:t
    })
    console.log(this.tasks)
  }

  removeTask(id:number){
    this.tasks=this.tasks.filter(n=>n.id!=id)
    console.log(this.tasks)
    return this.tasks
  }


  /*
  getTaskAsync(){
    let p=new Promise((success,error)=>{
      setTimeout(()=>{
        //return this.tasks
        success(this.tasks)
      },2000)
    })
    return p
  }
  */

  /*
  addTaskAsync(t:string,f:Function){
    setTimeout(()=>{
      this.tasks.push({
        id:this.tasks.length+1,
        completed:false,
        title:t
      })
      //f(this.tasks)
    },2000)
  }
  */

}
