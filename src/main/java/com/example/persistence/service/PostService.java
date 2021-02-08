package com.example.persistence.service;

import com.example.persistence.dao.PostRepository;
import com.example.persistence.model.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private PostRepository repository;
    private static final Logger logger = LoggerFactory.getLogger(PostService.class);

    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    public List<Post> getPosts() {
        List<Post> posts = repository.findAll();
        return posts;
    }


}
