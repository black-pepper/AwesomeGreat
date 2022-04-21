package com.baseurak.AwesomeGreat.member;

public interface MemberService {
    void join(Member member);
    Member findMember(String memberId);
}
