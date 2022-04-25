package com.baseurak.AwesomeGreat.member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    void save(Member member);
    Member findById(String memberId);
    public Optional<Member> findByLoginId(String loginId);
    public List<Member> findAll();
    public void clearStore();
}
