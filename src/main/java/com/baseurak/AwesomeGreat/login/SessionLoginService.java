package com.baseurak.AwesomeGreat.login;

import com.baseurak.AwesomeGreat.member.Member;
import com.baseurak.AwesomeGreat.member.MemberRepository;
import com.baseurak.AwesomeGreat.post.PostRepository;
import org.springframework.stereotype.Service;

//@Service
public class SessionLoginService {
    private MemberRepository memberRepository;

    public SessionLoginService(MemberRepository memberRepository){ this.memberRepository = memberRepository; }

    public Member login(String loginId, String password) {
        /*
        Optional<Member> findMemberOptional = memberRepository.findByLoginId(loginId);
        Member member = findMemberOptional.get();
        if (member.getPassword().equals(password)) {
            return member;
        } else {
            return null;
        }*/
        return memberRepository.findByLoginId(loginId)
                .filter(m -> m.getPassword().equals(password))
                .orElse(null);
    }
}
