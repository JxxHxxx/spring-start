package com.jxx.springstart.chap07.main;


import com.jxx.springstart.chap07.Calculator;
import com.jxx.springstart.chap07.RecCalculator;
import com.jxx.springstart.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppCtx.class);
        Calculator calculator = ac.getBean("calculator", Calculator.class);
//        RecCalculator calculator = ac.getBean("calculator", RecCalculator.class);
        calculator.factorial(7);
        calculator.factorial(7);
        calculator.factorial(5);
        calculator.factorial(5);
        ac.close();


    }
}
