import { Component, OnInit } from '@angular/core';
import { Post } from '../post';
import { PostService } from '../post.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-inactive',
  templateUrl: './inactive.component.html',
  styleUrls: ['./inactive.component.scss']
})
export class InactiveComponent implements OnInit {

  posts:Post[] = this.ps.getPostFiltrati(false);

  constructor(private ps:PostService, private activatedRouted:ActivatedRoute) { }

  ngOnInit(): void {
  }

  attiva(id:number) {
    console.log(id);
    this.posts = this.posts.filter(p=>p.id!=id)
    this.ps.toggle(id);

  }

}
