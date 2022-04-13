package com.baseurak.demo.post;

import java.util.List;

public interface PostRepository {
    void create(Post post);
    List<Post> read(Long postId1, Long postId2);
    void update(Post post);
    void delete(Long PostId);
}
