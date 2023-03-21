package com.jxx.springstart.chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 스프링의 핵심 기능은 객체를 생성하고 초기화하는 것이다. 이와 관련된 기능은  ApplicationContext 인터페이스에 정의되어 있다.
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);

        Greeter g = ctx.getBean("greeter", Greeter.class);
        String msg = g.greet("스프링");
        System.out.println(msg);
        System.out.println("==================");


        // 스프링 빈 싱글톤 확인
        Greeter greeterA = ctx.getBean("greeter", Greeter.class);
        Greeter greeterB = ctx.getBean("greeter", Greeter.class);

        System.out.println("(greeterA == greeterB) = " + (greeterA == greeterB)); // greeterA 와 greeterB 가 같은 객체임을 말한다.
        ctx.close();

    }
}
