package com.baseurak.AwesomeGreat;

import com.baseurak.AwesomeGreat.post.Post;
import com.baseurak.AwesomeGreat.post.PostService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    // AppConfig appConfig = new AppConfig();
    // PostService postService = appConfig.postService();

    ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
    PostService postService = ac.getBean("postService", PostService.class);

    public Long lastId = 2L;
    public String redirect = "<meta http-equiv=\"refresh\" content=\"0;url=/main\">";

    @GetMapping("/post") //메인 페이지 글 읽기
    public List<Post> readPosts() {
        return postService.read(0L, lastId);
    }

    @GetMapping("/post/{id}") //세부 페이지 글 읽기
    public Post readOnePost(@PathVariable("id") Long postId){
        return postService.read(postId);
    }

    @PostMapping("/post") //새 게시글 작성
    public String writePost(Post post) {
        post.setId(++lastId);
        postService.write(post);
        return redirect;
    }

    @DeleteMapping("/post/{id}") //게시글 삭제
    public String deletePost(@PathVariable("id") Long postId) {
        postService.delete(postId);
        return "redirect:/";
    }

    @PostMapping("/post/{id}") //게시글 수정
    public String modifyPost(Post post) {
        postService.modify(post.getId(), post.getContents());
        return redirect;
    }
}