import { Component } from '@angular/core';
import { UsersService } from './service/users.service';
import { User } from './interface/user.interface';
import { Subscription } from "rxjs";


@Component({
   selector: 'app-root',
   templateUrl: './app.component.html',
   styleUrls: ['./app.component.scss']
})
export class AppComponent {
   title = 'teoriaLunediPt2';

   newUser:{
      first_name:string,
      last_name:string
   } ={
      first_name:" ",
      last_name:" "
   }

   sub!:Subscription;
   users:User[] | undefined;


   constructor(private userSrv:UsersService) {}

   ngOnInit():void{
      this.recuperaUtenti();
   }

   recuperaUtenti(){
      this.sub=this.userSrv.get().subscribe((ris)=>{
         console.log(ris);
         this.users=ris;
      });
   }

   creaUtente(){
      this.sub=this.userSrv.post(this.newUser).subscribe((ris)=>{
         console.log(ris);
         this.users?.push(ris);
      });
   }

   cancellaUtente(id:number){
      this.sub=this.userSrv.delete(id).subscribe((ris)=>{
         console.log(ris);
         this.users=this.users?.filter((x)=>x.id!=id)
      })
   }

   ngOnDestroy():void{
      this.sub.unsubscribe
   }


}
