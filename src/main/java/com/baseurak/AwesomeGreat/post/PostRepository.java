package com.baseurak.AwesomeGreat.post;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository {
    void create(Post post);
    List<Post> read(Long postId1, Long postId2);
    Post read(Long postId);
    void update(Post post);
    void delete(Long postId);
}
