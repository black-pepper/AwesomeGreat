package com.baseurak.demo;

import com.baseurak.demo.member.MemberRepository;
import com.baseurak.demo.member.MemberService;
import com.baseurak.demo.member.MemberServiceImpl;
import com.baseurak.demo.member.MemoryMemberRepositoey;
import com.baseurak.demo.post.MemoryPostRepository;
import com.baseurak.demo.post.PostRepository;
import com.baseurak.demo.post.PostService;
import com.baseurak.demo.post.PostServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepositoey();
    }

    @Bean
    public PostService postService() {
        return new PostServiceImpl(postRepository());
    }

    @Bean
    public PostRepository postRepository() {
        return new MemoryPostRepository();
    }

}
