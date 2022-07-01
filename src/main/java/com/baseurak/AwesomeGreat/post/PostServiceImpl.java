package com.baseurak.AwesomeGreat.post;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

//    public PostServiceImpl(PostRepository postRepository) {
//        this.postRepository = postRepository;
//    }

    @Override
    public void write(Post post) {
        LocalDate now = LocalDate.now();
        post.setUploadDate(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd ")));
        post.setUserId(0L);
        post.setReport(0);
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
    public void modify(Long postId, String contents) {
        Post post = postRepository.read(postId);
        post.setContent(contents);
        postRepository.update(post);
    }

    @Override
    public void delete(Long postId) {
        postRepository.delete(postId);
    }
}
