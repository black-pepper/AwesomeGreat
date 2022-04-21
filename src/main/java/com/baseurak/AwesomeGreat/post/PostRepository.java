package com.baseurak.AwesomeGreat.post;

import java.util.List;

public interface PostRepository {
    void create(Post post);
    List<Post> read(Long postId1, Long postId2);
    Post read(Long postId);
    void update(Post post);
    void delete(Long PostId);
}
