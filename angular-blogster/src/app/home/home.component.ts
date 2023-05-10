import { Component, OnInit } from '@angular/core';
import { PostModel } from '../shared/post-model';
import { PostService } from '../shared/post.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  posts: Array<PostModel> = [];
  page: number = 1;
  count: number = 0;
  tableSize: number = 7;
  tableSizes: any = [3, 6, 9, 12];

  constructor(private postService: PostService) {
    // this.postService.getAllPosts().subscribe(post => {
    //   this.posts = post;
    // });
  }

  ngOnInit(): void {
    this.fetchPosts();
  }

  fetchPosts(): void {
    this.postService.getAllPosts().subscribe(post => {
      this.posts = post;
    });
  }

  onTableSizeChange(event: any) : void {
    this.tableSize = event.target.value;
    this.page = 1;
    this.fetchPosts();
  }
}
