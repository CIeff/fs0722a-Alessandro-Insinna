import { Injectable } from '@angular/core';
import { Photos } from '../interface/photos.interface';
import { HttpClient } from '@angular/common/http';
import { map } from "rxjs/operators"

@Injectable({
  providedIn: 'root'
})
export class PhotosService {

  constructor(private http:HttpClient) { }

  getPhotos(){
    return this.http.get<Photos[]>("https://jsonplaceholder.typicode.com/photos").pipe(map(ris=>ris))
  }

  deletePhoto(id:number){
    return this.http.delete("https://jsonplaceholder.typicode.com/photos/"+id)
  }


}
