package com.baseurak.demo.post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryPostRepository implements PostRepository {

    private static Map<Long, Post> store = new HashMap<>();

    @Override
    public void create(Post post) {
        store.put(post.getId(), post);
    }

    @Override
    public List<Post> read(Long PostId1, Long PostId2) {
        List<Post> posts = new ArrayList<>();
        for (int i = PostId1.intValue(); i<=PostId2.intValue(); i++){
            posts.add(store.get(Long.valueOf(i)));
        }
        return posts;
    }

    @Override
    public void update(Post post) {
        store.put(post.getId(), post);
    }

    @Override
    public void delete(Long postId) {
        store.remove(postId);
    }
}
