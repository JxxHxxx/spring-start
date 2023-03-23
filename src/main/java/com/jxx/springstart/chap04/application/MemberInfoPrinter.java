package com.jxx.springstart.chap04.application;

import com.jxx.springstart.chap04.domain.Member;
import com.jxx.springstart.chap04.domain.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

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

    @Autowired
    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    @Autowired
//    @Qualifier("printer")
    public void setPrinter(MemberPrinter printer) {
        this.printer = printer;
    }
}
