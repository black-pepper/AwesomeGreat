package com.baseurak.demo.member;

public interface MemberRepository {
    void save(Member member);
    Member findById(String memberId);
}
