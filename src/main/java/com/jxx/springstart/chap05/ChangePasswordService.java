package com.jxx.springstart.chap05;

import com.jxx.springstart.chap04.exception.MemberNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class ChangePasswordService {
    private final MemberDao memberDao;

    public ChangePasswordService(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public void changePassword(String email, String oldPwd, String newPwd) {
        System.out.println("비밀번호 변경을 시작합니다.");
        Member member = memberDao.selectByEmail(email);
        if (member == null) {
            throw new MemberNotFoundException();
        }
        member.changePassword(oldPwd, newPwd);
        memberDao.update(member);
    }
}
