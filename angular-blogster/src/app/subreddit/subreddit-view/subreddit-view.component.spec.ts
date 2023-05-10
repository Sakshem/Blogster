import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SubredditViewComponent } from './subreddit-view.component';

describe('SubredditViewComponent', () => {
  let component: SubredditViewComponent;
  let fixture: ComponentFixture<SubredditViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SubredditViewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SubredditViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
