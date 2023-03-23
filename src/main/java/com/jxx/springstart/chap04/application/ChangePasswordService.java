package com.jxx.springstart.chap04.application;

import com.jxx.springstart.chap04.domain.Member;
import com.jxx.springstart.chap04.domain.MemberDao;
import com.jxx.springstart.chap04.exception.MemberNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

public class ChangePasswordService {
    /**
     * @Autowired 애노테이션을 붙이면 설정 클래스에서 의존을 주입하지 않아도 된다.
     * 애노테이션이 붙어 있으면 스프링이 해당 타입의 빈 객체를 찾아서 필드에 할당한다.
     */
    @Autowired
    private MemberDao memberDao;

    public void changePassword(String email, String oldPwd, String newPwd) {
        System.out.println("비밀번호 변경을 시작합니다.");
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
