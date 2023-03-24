package com.jxx.springstart.chap04_2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class MemoryMemberDao implements MemberDao{
    @Override
    public void save() {
        System.out.println("메모리 DB로 저장합니다.");
    }
}
