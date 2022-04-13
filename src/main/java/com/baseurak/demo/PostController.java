package com.baseurak.demo;

import com.baseurak.demo.post.Post;
import com.baseurak.demo.post.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PostController {

    AppConfig appConfig = new AppConfig();
    PostService postService = appConfig.postService();

    @GetMapping("posts")
    public List<Post> Post() {
        postService.write(new Post(0L, "00", "2022-01-26", "오늘 아침에 일찍 일어났어용"));
        postService.write(new Post(1L, "01", "2022-01-26", "운동하고 돌아왔습니다"));
        postService.write(new Post(2L, "00", "2022-01-26", "오늘 공부 끝!!!"));
        return postService.read(0L, 2L);
    }
}