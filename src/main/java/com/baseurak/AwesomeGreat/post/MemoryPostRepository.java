package com.baseurak.AwesomeGreat.post;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Repository
public class MemoryPostRepository implements PostRepository {

    private static Map<Long, Post> store = new HashMap<>();

    public MemoryPostRepository(){
        store.put(0L, new Post(0L, 0L, "2022-01-26", "오늘 아침에 일찍 일어났어용", 0));
        store.put(1L, new Post(1L, 1L, "2022-01-26", "운동하고 돌아왔습니다", 0));
        store.put(2L, new Post(2L, 0L, "2022-01-26", "오늘 공부 끝!!!", 0));
    }

    @Override
    public void create(Post post) {
        store.put(post.getId(), post);
    }

    @Override
    public List<Post> read(Long PostId1, Long PostId2) {
        List<Post> posts = new ArrayList<>();
        for (int i = PostId2.intValue(); i>=PostId1.intValue(); i--){
            if (store.containsKey(Long.valueOf(i))){
                posts.add(store.get(Long.valueOf(i)));
            }
        }
        return posts;
    }

    @Override
    public Post read(Long postId){
        return store.get(postId);
    }

    @Override
    public void update(Post post) {
        store.put(post.getId(), post);
        System.out.println(post.getId());
    }

    @Override
    public void delete(Long postId) {
        store.remove(postId);
    }
}
