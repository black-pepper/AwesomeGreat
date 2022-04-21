package com.baseurak.AwesomeGreat;

import com.baseurak.AwesomeGreat.member.MemberRepository;
import com.baseurak.AwesomeGreat.member.MemberService;
import com.baseurak.AwesomeGreat.member.MemberServiceImpl;
import com.baseurak.AwesomeGreat.member.MemoryMemberRepositoey;
import com.baseurak.AwesomeGreat.post.MemoryPostRepository;
import com.baseurak.AwesomeGreat.post.PostRepository;
import com.baseurak.AwesomeGreat.post.PostService;
import com.baseurak.AwesomeGreat.post.PostServiceImpl;
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
