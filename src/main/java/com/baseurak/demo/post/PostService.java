package com.baseurak.demo.post;

import java.util.List;
import java.util.Map;

public interface PostService {
    void write(Post post);
    List<Post> read(Long postId1, Long postId2);
    Post read(Long postId);
    void modify(Post post);
    void delete(Long postId);
}