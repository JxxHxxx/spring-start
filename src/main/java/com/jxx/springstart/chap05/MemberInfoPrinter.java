package com.jxx.springstart.chap05;

import org.springframework.stereotype.Component;

@Component("infoPrinter")
public class MemberInfoPrinter {
    private MemberDao memberDao;
    private MemberPrinter printer;

    public void printMemberInfo(String email) {
        Member member = memberDao.selectByEmail(email);
        if (member == null) {
            System.out.println("데이터 없음");
            return;
        }
        printer.print(member);
    }
}
