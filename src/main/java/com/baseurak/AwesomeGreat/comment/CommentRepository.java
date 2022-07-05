package com.baseurak.AwesomeGreat.comment;
import java.util.List;

public interface CommentRepository {
    void create(Comment comment);
    List<Comment> read(Long postId);
    void update(Long commentId, String contents);
    void delete(Long commentId);
}