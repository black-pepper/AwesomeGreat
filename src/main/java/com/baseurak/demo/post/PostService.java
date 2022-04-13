package com.baseurak.demo.post;

import java.util.List;
import java.util.Map;

public interface PostService {
    void write(Post post);
    List<Post> read(Long PostId1, Long PostId2);
    void modify(Post post);
    void delete(Long postId);
}