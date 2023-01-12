import { Injectable } from '@angular/core';
import { Post } from '../interface/post.interface';


@Injectable({
  providedIn: 'root'
})
export class PostsService {





  private posts:Post[]= []



  constructor() { }

  getPosts(){
    return this.posts
  }



}
