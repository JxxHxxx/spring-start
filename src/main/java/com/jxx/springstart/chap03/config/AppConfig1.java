package com.jxx.springstart.chap03.config;

import com.jxx.springstart.chap03.MemberPrinter;
import com.jxx.springstart.chap03.domain.MemberDao;
import com.jxx.springstart.chap03.domain.MemoryMemberDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig1 {

    @Bean
    public MemberDao memberDao() {
        return new MemoryMemberDao();
    }

    @Bean
    public MemberPrinter memberPrinter() {
        return new MemberPrinter();
    }
}
