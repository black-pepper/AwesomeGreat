package com.baseurak.AwesomeGreat;

import com.baseurak.AwesomeGreat.login.SessionLoginService;
import com.baseurak.AwesomeGreat.post.MemoryPostRepository;
import com.baseurak.AwesomeGreat.post.PostRepository;
import com.baseurak.AwesomeGreat.post.PostService;
import com.baseurak.AwesomeGreat.post.PostServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import static org.springframework.context.annotation.ComponentScan.*;

@Configuration
//@ComponentScan(excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = Configuration.class))
public class AppConfig {

    /*
    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    */
//    @Bean
//    public PostService postService() {
//        return new PostServiceImpl(postRepository());
//    }
//
//    @Bean
//    public PostRepository postRepository() {
//        return new MemoryPostRepository();
//    }

}
