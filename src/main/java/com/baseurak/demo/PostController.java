package com.baseurak.demo;

import com.baseurak.demo.post.Post;
import com.baseurak.demo.post.PostService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PostController {

    // AppConfig appConfig = new AppConfig();
    // PostService postService = appConfig.postService();

    ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
    PostService postService = ac.getBean("postService", PostService.class);

    public Long lastId = 2L;
    public String redirect = "<meta http-equiv=\"refresh\" content=\"0;url=/main\">";

    @GetMapping("/post")
    public List<Post> Post() {
        return postService.read(0L, lastId);
    }

    @PostMapping("/post")
    public String writePost(Post post) {
        post.setId(++lastId);
        postService.write(post);
        return redirect;
    }

    @DeleteMapping("/post/{id}")
    public String DeletePost(@PathVariable("id") Long postId) {
        postService.delete(postId);
        return "redirect:/";
    }
}