package com.baseurak.demo;

import com.baseurak.demo.member.MemberRepository;
import com.baseurak.demo.member.MemberService;
import com.baseurak.demo.member.MemberServiceImpl;
import com.baseurak.demo.member.MemoryMemberRepositoey;
import com.baseurak.demo.post.MemoryPostRepository;
import com.baseurak.demo.post.PostRepository;
import com.baseurak.demo.post.PostService;
import com.baseurak.demo.post.PostServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    public MemberRepository memberRepository() {
        return new MemoryMemberRepositoey();
    }

    public PostService postService() {
        return new PostServiceImpl(postRepository());
    }

    public PostRepository postRepository() {
        return new MemoryPostRepository();
    }

}
