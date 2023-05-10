import { ActivatedRoute } from '@angular/router';
import { SubredditService } from './../subreddit.service';
import { Component, OnInit } from '@angular/core';
import { SubredditModel } from '../subreddit-response';
import { throwError } from 'rxjs';
@Component({
  selector: 'app-subreddit-view',
  templateUrl: './subreddit-view.component.html',
  styleUrls: ['./subreddit-view.component.css']
})
export class SubredditViewComponent implements OnInit {
  public subreddit_id: number;
  public subreddits: SubredditModel[];
  constructor(private subredditService : SubredditService,
              private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.subreddit_id = this.route.snapshot.params.id;
    this.subredditService.getSubreddit(this.subreddit_id).subscribe(data => {
      console.log(data);
      // console.log("subreddit view: " + data);
      // this.subreddits = data;
    }, error => {
      throwError(error);
    });
  }

}
