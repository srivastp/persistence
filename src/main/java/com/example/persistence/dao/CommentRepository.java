package com.example.persistence.dao;

import com.example.persistence.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    @Query("SELECT DISTINCT comment FROM Comment comment " +
            "JOIN FETCH comment.post post")
    List<Comment> retrieveAll();
}
