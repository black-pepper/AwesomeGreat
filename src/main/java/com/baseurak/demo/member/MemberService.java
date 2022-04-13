package com.baseurak.demo.member;

public interface MemberService {
    void join(Member member);
    Member findMember(String memberId);
}
