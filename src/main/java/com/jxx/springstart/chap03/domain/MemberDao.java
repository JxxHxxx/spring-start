package com.jxx.springstart.chap03.domain;

import java.util.Collection;

public interface MemberDao {
    Member selectByEmail(String email);
    void insert(Member member);
    void update(Member member);
    Collection<Member> selectAll();
}
