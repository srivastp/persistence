package com.example.persistence.web;

import com.example.persistence.model.Post;
import com.example.persistence.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class PostController {
    private PostService service;

    public PostController(PostService service) {
        this.service = service;
    }

    @GetMapping("/posts")
    public List<Post> getPosts() {
        return service.getPosts();
    }

}
