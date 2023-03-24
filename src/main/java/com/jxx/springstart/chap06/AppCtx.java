package com.jxx.springstart.chap06;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jxx.springstart.chap06")
public class AppCtx {

    @Bean(initMethod = "connect", destroyMethod = "close")
    public Client2 client2() {
        return new Client2();
    }
}
