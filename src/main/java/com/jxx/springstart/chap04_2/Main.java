package com.jxx.springstart.chap04_2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication(scanBasePackages = "com.jxx.springstart.chap04_2")
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Main.class);


        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String s : beanDefinitionNames) {
            System.out.println(s);
        }
//        HelloService helloService = ac.getBean("helloService", HelloService.class);
//        helloService.init();
    }
}

