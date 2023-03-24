package com.jxx.springstart.chap05;

import com.jxx.springstart.chap04.exception.DuplicateMemberException;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MemberRegisterService {
    private MemberDao memberDao;

    public MemberRegisterService(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public Long regist(RegisterRequest req) {
        System.out.println("회원 등록합니다.");
        System.out.println("이메일은 = " + req.getEmail());
        //이메일로 회원 데이터 조회
        Member member = memberDao.selectByEmail(req.getEmail());
        if (member != null) {
            // 같은 이메일을 가진 회원이 이미 존재하면 예외 발생
            throw new DuplicateMemberException("dup email " + req.getEmail());
        }
        //같은 이메일을 가진 회원이 존재하지 않으면 DB에 산입
        Member newMember = new Member(req.getEmail(), req.getPassword(), req.getName(),
                LocalDateTime.now());
        memberDao.insert(newMember);
        return newMember.getId();
    }
}
