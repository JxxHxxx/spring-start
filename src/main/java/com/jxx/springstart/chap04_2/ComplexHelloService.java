package com.jxx.springstart.chap04_2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class ComplexHelloService extends HelloService {

    public ComplexHelloService(MemberDao memberDao) {
        super(memberDao);
    }

    @Override
    public void init() {
        System.out.println("안녕하세요. 감사합니다. 반갑습니다.");
    }
}
