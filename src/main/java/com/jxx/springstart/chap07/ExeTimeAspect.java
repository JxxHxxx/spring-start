package com.jxx.springstart.chap07;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

import java.util.Arrays;

@Aspect
@Order(2)
public class ExeTimeAspect {

    @Pointcut("execution(public * com.jxx.springstart.chap07.Calculator.*(..))") // 공통 기능을 적용할 대상 설정
    private void publicTarget() {
    }

    @Around("publicTarget()") // Around Advice 설정 @Pointcut 에서 설정한 대상을 적용한다.
    public Object measure(ProceedingJoinPoint joinPoint) throws Throwable {
        // ProceedingJointPoint 는 프록시 대상 객체의 메서드를 호출할 때 사용한다.
        long start = System.nanoTime();

        try {
            Object result = joinPoint.proceed();
            return result;
        }
        finally {
            long end = System.nanoTime();
            Signature signature = joinPoint.getSignature(); //자바에서 메서드 이름과 파라미터를 합쳐서 메서드 시그니처라고 한다.
            // 메서드 이름 다르거나 파라미터 타입, 개수가 다르면 시그니처가 다르다고 표현한다. 메서드의 리턴 타입이나 익셉션 타입은 시그니처에 포함되지 않는다.
            System.out.printf("%s.%s(%s) 실행 시간 : %d ns\n", joinPoint.getTarget().getClass().getSimpleName(),
                    signature.getName(), Arrays.toString(joinPoint.getArgs()), (end - start));
        }
    }
}
