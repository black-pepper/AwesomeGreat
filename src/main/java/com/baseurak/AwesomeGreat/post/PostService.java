package com.baseurak.AwesomeGreat.post;

import java.util.List;

public interface PostService {
    void write(Post post);
    List<Post> read(Long postId1, Long postId2);
    Post read(Long postId);
    void modify(Long postId, String contents);
    void delete(Long postId);
}