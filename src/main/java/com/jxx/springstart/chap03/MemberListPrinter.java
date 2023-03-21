package com.jxx.springstart.chap03;

import com.jxx.springstart.chap03.domain.Member;
import com.jxx.springstart.chap03.domain.MemberDao;
import com.jxx.springstart.chap03.domain.MemoryMemberDao;

import java.util.Collection;

public class MemberListPrinter {
    private MemberDao memberDao;
    private MemberPrinter printer;

    public MemberListPrinter(MemberDao memberDao, MemberPrinter printer) {
        this.memberDao = memberDao;
        this.printer = printer;
    }

    public void printAll() {
        Collection<Member> members = memberDao.selectAll();
        members.forEach(m -> printer.print(m));
    }
}
