package com.baseurak.AwesomeGreat.comment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

    @Override
    public void write(Comment comment) {
        LocalDateTime now = LocalDateTime.now();
        comment.setUploadDate(Timestamp.valueOf(now));
        comment.setUserId(0L);
        comment.setReport(0);
        comment.setId(null);
        commentRepository.create(comment);
    }

    @Override
    public List<Comment> read(Long commentId) {
        return commentRepository.read(commentId);
    }

    @Override
    public void modify(Long commentId, String content) {
        commentRepository.update(commentId, content);
    }

    @Override
    public void delete(Long commentId) {
        commentRepository.delete(commentId);
    }
}