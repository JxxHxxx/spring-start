package com.jxx.springstart.chap03.application;

import com.jxx.springstart.chap03.domain.Member;
import com.jxx.springstart.chap03.domain.MemberDao;
import com.jxx.springstart.chap03.exception.MemberNotFoundException;

public class ChangePasswordService {
    private MemberDao memberDao;

    public void changePassword(String email, String oldPwd, String newPwd) {
        Member member = memberDao.selectByEmail(email);
        if (member == null) {
            throw new MemberNotFoundException();
        }
        member.changePassword(oldPwd, newPwd);
        memberDao.update(member);
    }

    //세터 주입
    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }
}
