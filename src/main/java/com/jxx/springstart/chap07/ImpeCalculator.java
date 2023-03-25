package com.jxx.springstart.chap07;

public class ImpeCalculator implements Calculator {
    @Override
    public long factorial(long num) {
        long result = 1;
        for (long i = 1; i <= num; i++) {
            result *= i;
        }
        // joinPoint.proceed(); 를 호출하지 않았을 때 실행되는지 확인하는 용도
        System.out.println("ImpeCalculator에서 " + num + "팩토리얼을 계산합니다.");
        return result;
    }
}
