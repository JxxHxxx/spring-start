package com.jxx.springstart.chap03.config;

import com.jxx.springstart.chap03.MemberInfoPrinter;
import com.jxx.springstart.chap03.MemberListPrinter;
import com.jxx.springstart.chap03.MemberPrinter;
import com.jxx.springstart.chap03.application.ChangePasswordService;
import com.jxx.springstart.chap03.application.MemberRegisterService;
import com.jxx.springstart.chap03.domain.MemberDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {

    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }
    @Bean
    public MemberRegisterService memberRegisterService() {
        return new MemberRegisterService(memberDao());
    }
    @Bean
    public ChangePasswordService changePasswordService() {
        ChangePasswordService changePasswordService = new ChangePasswordService();
        changePasswordService.setMemberDao(memberDao());
        return changePasswordService;
    }
    @Bean
    public MemberPrinter memberPrinter() {
        return new MemberPrinter();
    }
    @Bean
    public MemberListPrinter memberListPrinter() {
        return new MemberListPrinter(memberDao(), memberPrinter());
    }
    @Bean
    public MemberInfoPrinter memberInfoPrinter() {
        MemberInfoPrinter memberInfoPrinter = new MemberInfoPrinter();
        memberInfoPrinter.setPrinter(memberPrinter());
        memberInfoPrinter.setMemberDao(memberDao());
        return memberInfoPrinter;
    }
}
