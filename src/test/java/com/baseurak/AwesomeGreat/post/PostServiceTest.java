package com.baseurak.AwesomeGreat.post;

import com.baseurak.AwesomeGreat.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

class PostServiceTest {

    PostService postService;
    @BeforeEach
    public void beforeEach(){
        //AppConfig appConfig = new AppConfig();
        //postService = appConfig.postService();
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        postService = ac.getBean("postService", PostService.class);
    }

    @Test
    void write() {
        //given
        Post post = new Post(0L, "00", "2022-02-23","안녕하세요!");

        //when
        postService.write(post);
        List<Post> readPost = postService.read(0L, 0L);

        //then
        Assertions.assertThat(post).isEqualTo(readPost.get(0));
        Assertions.assertThat(post).isEqualTo(postService.read(0L));
    }

    @Test
    void read() {
    }

    @Test
    void modify() {
    }

    @Test
    void delete() {
    }
}