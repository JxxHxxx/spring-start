package com.jxx.springstart.chap05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppCtx.class);
        String[] beans = ac.getBeanDefinitionNames();
        for (String bean : beans) {
            System.out.println(bean);
        }

        MemberPrinter memberPrinter = ac.getBean("memberPrinter", MemberPrinter.class);
        MemberRegisterService memberRegisterService = ac.getBean("memberRegisterService", MemberRegisterService.class);

        RegisterRequest req = new RegisterRequest();
        req.setEmail("leesin5498@naver.com");
        req.setName("jxxHxxx");
        req.setPassword("1234");

        memberRegisterService.regist(req);

        MemberDao memberDao = ac.getBean("memberDao", MemberDao.class);
        Member member = memberDao.selectByEmail("leesin5498@naver.com");


        memberPrinter.print(member);
    }
}
