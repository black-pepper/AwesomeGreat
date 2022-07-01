package com.baseurak.AwesomeGreat.post;

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
public class JpaPostRepository implements PostRepository{

    private final EntityManager em;
    private final JPAQueryFactory query;

    public JpaPostRepository(EntityManager em) {
        this.em = em;
        this.query = new JPAQueryFactory(em);
    }

    @Override
    public void create(Post post) {
        em.persist(post);
    }

    @Override
    public List<Post> read(Long postId1, Long postId2) {
        String jpql = "select i from Post i";
        //String jpql = "select i from Post i where i.Id >= :postId1 and i.Id <= :postId2";
        TypedQuery<Post> query = em.createQuery(jpql, Post.class);
        return query.getResultList();
    }

    @Override
    public Post read(Long postId) {
        Post post = em.find(Post.class, postId);
        return post;
    }

    @Override
    public void update(Post post) {
        Long postId = post.getId();
        Post findPost = em.find(Post.class, postId);
        findPost.setContent(post.getContent());
    }

    @Override
    public void delete(Long postId) {
        Post findPost = em.find(Post.class, postId);
        em.remove(findPost);
    }
}