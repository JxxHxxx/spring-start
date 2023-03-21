package com.jxx.springstart.chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 해당 클래스를 스프링 설정 클래스로 지정한다.
public class AppContext {
    /**
     * Bean 애노테이션을 붙인 메서드의 이름은 빈 객체를 구분할 때 사용한다. 예를 들어
     * 아래 메서드에서 생성한 객체를 구분할 때 greeter라는 이름을 사용한다.
     * 이 이름은 빈 객체를 참조할 때 사용한다.
     */
    @Bean // 해당 메서드가 생성한 객체를 스프링이 관리하는 빈 객체로 등록한다.
    public Greeter greeter() { // greater() 는 Greeter 라는 Bean에 대한 정보를 담고 있는 메서드이다.
        Greeter greeter = new Greeter();
        greeter.setFormat("%s, 안녕하세요"); // 객체 초기화
        return greeter;
    }

    @Bean
    public Greeter greeter2() {
        Greeter greeter = new Greeter();
        greeter.setFormat("%s, 안녕하세요2");
        return greeter;
    }
}

