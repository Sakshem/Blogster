package com.programming.sakshem.blogster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.programming.sakshem.blogster.model.Post;
import com.programming.sakshem.blogster.model.Subreddit;
import com.programming.sakshem.blogster.model.User;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);

}
