package com.jxx.springstart.chap04.config;

import com.jxx.springstart.chap04.application.*;
import com.jxx.springstart.chap04.domain.MemberDao;
import com.jxx.springstart.chap04.domain.MemoryMemberDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCpx {

    @Bean
    public MemberDao memberDao() {
        return new MemoryMemberDao();
    }

    @Bean
    @Qualifier("printer")
    public MemberPrinter memberPrinter() {
        return new MemberPrinter();
    }

    @Bean
//    @Qualifier("printer")
    public MemberSummaryPrinter memberPrinter2() {
        return new MemberSummaryPrinter();
    }

    @Bean
    public MemberRegisterService memberRegisterService() {
        return new MemberRegisterService(memberDao());
    }

    @Bean
    public ChangePasswordService changePasswordService() {
        ChangePasswordService changePasswordService = new ChangePasswordService();
        // 아래 메서드가 없어도 ChangePasswordService 의 @Autowired 애노테이션 덕분에 의존 주입이 된다.
//        changePasswordService.setMemberDao(memberDao());
        return changePasswordService;
    }

    @Bean
    public MemberListPrinter memberListPrinter() {
        return new MemberListPrinter();
//        return new MemberListPrinter(memberDao(), memberPrinter());
    }

    @Bean
    public MemberInfoPrinter memberInfoPrinter() {
        MemberInfoPrinter memberInfoPrinter = new MemberInfoPrinter();
//        memberInfoPrinter.setPrinter(memberPrinter());
//        memberInfoPrinter.setMemberDao(memberDao());
        return memberInfoPrinter;
    }
}
