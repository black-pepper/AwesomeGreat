package com.baseurak.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestPostController {

    public Map<String, String> addPost(String id, String userid, String datetime, String contents) {
        Map<String, String> post = new HashMap<>();
        post.put("id", id);
        post.put("userid", userid);
        post.put("datetime", datetime);
        post.put("contents", contents);
        return post;
    }

    //@GetMapping("posts")
    public List<Map> Post() {
        List<Map> posts = new ArrayList<>();
        posts.add(addPost("0", "00", "2022-01-26", "오늘 아침에 일찍 일어났어용"));
        posts.add(addPost("1", "01", "2022-01-26", "운동하고 돌아왔습니다"));
        posts.add(addPost("2", "00", "2022-01-26", "오늘 공부 끝!!!"));
        return posts;
    }
}