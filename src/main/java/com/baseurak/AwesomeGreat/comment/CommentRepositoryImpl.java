package com.baseurak.AwesomeGreat.comment;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Slf4j
@Repository
@Transactional
public class CommentRepositoryImpl implements CommentRepository {

    private final EntityManager em;
    private final JPAQueryFactory query;

    public CommentRepositoryImpl (EntityManager em) {
        this.em = em;
        this.query = new JPAQueryFactory(em);
    }

    @Override
    public void create(Comment comment) {
        em.persist(comment);
    }

    @Override
    public List<Comment> read(Long postId) {
        String jpql = "SELECT c FROM Comment AS c WHERE c.postId = :postId";
        TypedQuery<Comment> query = em.createQuery(jpql, Comment.class);
        query.setParameter("postId", postId);
        return query.getResultList();
    }

    @Override
    public void update(Long commentId, String contents) {
        Comment findPost = em.find(Comment.class, commentId);
        findPost.setContent(contents);
    }

    @Override
    public void delete(Long commentId) {
        Comment findComment = em.find(Comment.class, commentId);
        em.remove(findComment);
    }
}
