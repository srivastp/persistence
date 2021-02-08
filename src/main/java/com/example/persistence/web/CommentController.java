package com.example.persistence.web;

import com.example.persistence.model.Comment;
import com.example.persistence.service.CommentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CommentController {
    private CommentService service;

    public CommentController(CommentService service) {
        this.service = service;
    }

    @GetMapping("/comments")
    public List<Comment> getPostComments() {
        return service.getPostComments();
    }

}
