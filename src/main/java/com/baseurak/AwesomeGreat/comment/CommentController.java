package com.baseurak.AwesomeGreat.comment;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class CommentController {
    @Autowired
    CommentService commentService;

    //public Long lastId = 2L;
    public String redirect(Long postId){
        return "<meta http-equiv=\"refresh\" content=\"0;url=/post/"+ postId.toString() +"\">";
    }

    @GetMapping("/comment/{id}") //댓글 읽기
    public List<Comment> readPosts(@PathVariable("id") Long postId)
    {
        return commentService.read(postId);
    }

    @PostMapping("/comment") //새 댓글 작성
    public String writePost(Comment comment) {
        log.info(comment.toString());
        commentService.write(comment);
        return redirect(comment.getPostId());
    }

    @DeleteMapping("/comment/{id}") //댓글 삭제
    public String deletePost(@PathVariable("id") Long id) {
        commentService.delete(id);
        return "redirect";
    }

    @PutMapping("/comment") //댓글 수정
    public String modifyPost(Comment comment) {
        commentService.modify(comment.getId(), comment.getContent());
        return redirect(comment.getPostId());
    }
}
