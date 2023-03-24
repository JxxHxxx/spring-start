package com.jxx.springstart.chap06;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppCtx.class);
        Client client = ac.getBean("client", Client.class);
        client.setHost("jxxhxxx");
        client.send();

        ac.close();
    }
}
