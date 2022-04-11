package com.baseurak.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PostController {

    @GetMapping("posts")
    public List<Map> Post() {
        List<Map> posts = new ArrayList<>();
        Map<String, String> post1 = new HashMap<>();
        post1.put("id", "0");
        post1.put("userid","00");
        post1.put("datetime", "2022-01-26");
        post1.put("contents", "오늘 아침에 일찍 일어났어용");
        posts.add(post1);
        return posts;
    }
}