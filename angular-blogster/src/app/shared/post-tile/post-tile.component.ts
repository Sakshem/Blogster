import { PostService } from 'src/app/shared/post.service';
import { Component, OnInit, ViewEncapsulation, Input } from '@angular/core';
// import { PostService } from '../post.service';
import { PostModel } from '../post-model';
import { faComments } from '@fortawesome/free-solid-svg-icons';
import { Router } from '@angular/router';

@Component({
  selector: 'app-post-tile',
  templateUrl: './post-tile.component.html',
  styleUrls: ['./post-tile.component.css'],
  encapsulation: ViewEncapsulation.None,
})
export class PostTileComponent implements OnInit {

  faComments = faComments;
  // @Input() posts: PostModel[];
  posts: PostModel[];
  page: number = 1;
  count: number = 0;
  tableSize: number = 3;
  tableSizes: any = [3, 6, 9, 12];

  constructor(private router: Router, private postService: PostService) { }

  ngOnInit(): void {
    this.fetchPosts();
  }

  fetchPosts(): void  {
    this.postService.getAllPosts().subscribe(post => {
      this.posts = post;
    });
  }
  goToPost(id: number): void {
    this.router.navigateByUrl('/view-post/' + id);
  }
  onTableSizeChange(event: any) : void {
    this.tableSize = event.target.value;
    this.page = 1;
    this.fetchPosts();
  }
  onTableDataChange(event: any) : void {
    this.page = event;
    this.fetchPosts();
  }
}
