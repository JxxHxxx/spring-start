package com.jxx.springstart.chap04;

import com.jxx.springstart.chap04.application.MemberInfoPrinter;
import com.jxx.springstart.chap04.application.MemberPrinter;
import com.jxx.springstart.chap04.domain.Member;
import com.jxx.springstart.chap04.domain.MemberDao;
import com.jxx.springstart.chap04.application.ChangePasswordService;
import com.jxx.springstart.chap04.config.AppCpx;
import com.jxx.springstart.chap04.domain.MemoryMemberDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;

/**
 * 의존 관게 자동 주입 테스트
 */

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppCpx.class);
        ChangePasswordService changePasswordService = ac.getBean("changePasswordService", ChangePasswordService.class);
        MemoryMemberDao memoryMemberDao = ac.getBean("memberDao", MemoryMemberDao.class);

        memoryMemberDao.insert(new Member("이메일", "1234","자몽", LocalDateTime.now()));
        Member member = memoryMemberDao.selectByEmail("이메일");

        changePasswordService.changePassword(member.getEmail(), member.getPassword(), "ABCDE");
        Member updateMember = memoryMemberDao.selectByEmail("이메일");

        System.out.println("====================");
        System.out.println("password is ABCDE = " + updateMember.getPassword().equals("ABCDE"));

        MemberInfoPrinter printer = ac.getBean("memberInfoPrinter", MemberInfoPrinter.class);
        printer.printMemberInfo("이메일");

        MemberPrinter memberPrinter2 = ac.getBean("memberPrinter2", MemberPrinter.class);
        // @Qualifier 동작 테스트
        System.out.println("memberPrinter2 is not null = " + (memberPrinter2 != null));
    }
}
