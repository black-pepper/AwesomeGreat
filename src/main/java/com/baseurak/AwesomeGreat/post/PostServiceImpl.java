package com.baseurak.AwesomeGreat.post;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

//    public PostServiceImpl(PostRepository postRepository) {
//        this.postRepository = postRepository;
//    }

    @Override
    public void write(Post post) {
        LocalDateTime now = LocalDateTime.now();
        post.setUploadDate(Timestamp.valueOf(now));
        post.setUserId(0L);
        post.setReport(0);
        postRepository.create(post);
    }

    @Override
    public List<Post> read(Long postId, int cnt) {
        return postRepository.read(postId, cnt);
    }

    @Override
    public Post read(Long postId) {
        return postRepository.read(postId);
    }

    @Override
    public void modify(Long postId, String contents) {
        postRepository.update(postId, contents);
    }

    @Override
    public void delete(Long postId) {
        postRepository.delete(postId);
    }
}
