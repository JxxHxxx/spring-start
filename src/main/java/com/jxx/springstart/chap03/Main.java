package com.jxx.springstart.chap03;

import com.jxx.springstart.chap03.application.MemberRegisterService;
import com.jxx.springstart.chap03.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppCtx.class);
        MemberRegisterService memberRegisterService =
                ac.getBean("memberRegisterService", MemberRegisterService.class);
    }
}
