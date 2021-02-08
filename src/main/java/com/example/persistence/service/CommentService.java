package com.example.persistence.service;

import com.example.persistence.dao.CommentRepository;
import com.example.persistence.model.Comment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    private CommentRepository repository;
    private static final Logger logger = LoggerFactory.getLogger(CommentService.class);

    public CommentService(CommentRepository repository) {
        this.repository = repository;
    }

    public List<Comment> getPostComments() {
        List<Comment> comments = repository.retrieveAll();
        //List<Comment> comments = repository.findAll();
        return comments;
    }
}
