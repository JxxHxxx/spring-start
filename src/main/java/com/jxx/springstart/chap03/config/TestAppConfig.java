package com.jxx.springstart.chap03.config;


import com.jxx.springstart.chap03.MemberPrinter;
import com.jxx.springstart.chap03.domain.MemberDao;
import com.jxx.springstart.chap03.domain.TestEnvMemberDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestAppConfig {

    @Bean
    public MemberDao memberDao() {
        return new TestEnvMemberDao();
    }

    @Bean
    public MemberPrinter memberPrinter() {
        return new MemberPrinter();
    }
}
