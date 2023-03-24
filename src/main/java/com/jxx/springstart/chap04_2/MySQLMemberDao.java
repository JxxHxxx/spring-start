package com.jxx.springstart.chap04_2;

import org.springframework.stereotype.Repository;

@Repository
public class MySQLMemberDao implements MemberDao{
    @Override
    public void save() {
        System.out.println("MySQL DB로 저장합니다.");
    }
}
