package com.baseurak.AwesomeGreat.Comment;
import java.util.List;

public interface CommentRepository {
    void create(Comment comment);
    List<Comment> read(Long postId);
    Comment readOne(Long commentId);
    void update(Comment comment);
    void delete(Long commentId);
}