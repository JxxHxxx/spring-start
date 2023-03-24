package com.jxx.springstart.chap06;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Client implements InitializingBean, DisposableBean {
    private String host;
    public void setHost(String host) {
        this.host = host;
    }
    @Override
    public void afterPropertiesSet() {
        System.out.println("Client.afterPropertiesSet() 실행");

    }
    public void send() {
        System.out.println("Client.send() to" + host);
    }
    @Override
    public void destroy() {
        System.out.println("Client.destroy() 실행");
    }
}
