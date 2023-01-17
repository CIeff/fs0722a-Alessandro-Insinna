import { Component, OnInit } from '@angular/core';
import { PhotosService } from 'src/app/service/photos.service';
import { Photos } from 'src/app/interface/photos.interface';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-photos',
  templateUrl: './photos.component.html',
  styleUrls: ['./photos.component.scss']
})
export class PhotosComponent implements OnInit {

  counter:number=0;
  photos!:Photos[];
  sub!:Subscription;

  constructor(private photoSrv:PhotosService) { }

  ngOnInit(): void {
    this.getPhotos();
  }

  getPhotos(){
    this.sub=this.photoSrv.getPhotos().subscribe((ris)=>{
      console.log(ris)
      console.log(this.photos)
      this.photos=ris;
    })
  }

  delete(id:number){
    this.sub=this.photoSrv.deletePhoto(id).subscribe((ris)=>{
      console.log(this.photos)
      this.photos=this.photos?.filter(x=>x.id!=id)
    })
  }

  miPiace(){
    this.counter=this.counter+1
  }

}
