package com.jxx.springstart.chap04_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    private final MemberDao memberDao;

    public HelloService(@Qualifier("memoryMemberDao") MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public void init() {
        memberDao.save();
        System.out.println("안녕하세요");
    }
}


//    @Autowired
//    private MemberDao memberDao;
//
//    public HelloService() {
//    }