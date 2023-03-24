package com.jxx.springstart.chap04_2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

//    @Bean
//    @Qualifier("memoryMemberDao")
//    public MemberDao memoryMemberDao(){
//        return new MemoryMemberDao();
//    }

//    @Bean
//    @Qualifier("mySQLMemberDao")
//    public MemberDao mySQLMemberDao(){
//        return new MySQLMemberDao();
//    }

//    @Bean
//    public HelloService helloService(){
//        return new HelloService();
//    }

//    @Bean
//    public ComplexHelloService complexHelloService(){
//        return new ComplexHelloService(memoryMemberDao());
//    }
}
