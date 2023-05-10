package com.programming.sakshem.blogster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.programming.sakshem.blogster.model.Comment;
import com.programming.sakshem.blogster.model.Post;
import com.programming.sakshem.blogster.model.User;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
