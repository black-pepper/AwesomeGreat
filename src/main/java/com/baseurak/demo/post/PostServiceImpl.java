package com.baseurak.demo.post;

import java.util.List;

public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public void write(Post post) {
        postRepository.create(post);
    }

    @Override
    public List<Post> read(Long postId1, Long postId2) {
        return postRepository.read(postId1, postId2);
    }

    @Override
    public Post read(Long postId) {
        return postRepository.read(postId);
    }

    @Override
    public void modify(Post post) {
        postRepository.update(post);
    }

    @Override
    public void delete(Long postId) {
        postRepository.delete(postId);
    }
}
