package com.baseurak.AwesomeGreat.post;

import com.baseurak.AwesomeGreat.AppConfig;
import com.baseurak.AwesomeGreat.post.Post;
import com.baseurak.AwesomeGreat.post.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class PostController {

    // AppConfig appConfig = new AppConfig();
    // PostService postService = appConfig.postService();

    @Autowired
    PostService postService;

    //public Long lastId = 2L;
    public String redirect = "<meta http-equiv=\"refresh\" content=\"0;url=/main\">";

    @GetMapping("/post") //메인 페이지 글 읽기
    public List<Post> readPosts(Long postId, int cnt) {
        return postService.read(postId, cnt);
    }

    @GetMapping("/post/{id}") //세부 페이지 글 읽기
    public Post readOnePost(@PathVariable("id") Long postId){
        return postService.read(postId);
    }

    @PostMapping("/post") //새 게시글 작성
    public String writePost(Long userId, String content) {
        Post post = new Post();
        post.setId(userId);
        post.setContent(content);
        postService.write(post);
        return redirect;
    }

    @DeleteMapping("/post/{id}") //게시글 삭제
    public String deletePost(@PathVariable("id") Long postId) {
        postService.delete(postId);
        return "redirect:/";
    }

    @PutMapping("/post") //게시글 수정
    public String modifyPost(Long postId, String content) {
        log.info("postId = {} , content = {}", postId, content);
        postService.modify(postId, content);
        return redirect;
    }
}