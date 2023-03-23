package com.jxx.springstart.chap04.domain;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemoryMemberDao implements MemberDao {

    private static long nextId = 0L;
    private Map<String, Member> map = new HashMap<>();

    @Override
    public Member selectByEmail(String email) {
        return map.get(email);
    }

    @Override
    public void insert(Member member) {
        member.setId(++nextId);
        map.put(member.getEmail(), member);
    }

    @Override
    public void update(Member member) {
        map.put(member.getEmail(), member);
    }

    @Override
    public Collection<Member> selectAll() {
        return map.values();
    }
}
