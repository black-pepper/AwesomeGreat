package com.baseurak.AwesomeGreat.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepositoey implements MemberRepository {

    private static Map<String, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(String memberId) {
        return store.get(memberId);
    }
}
