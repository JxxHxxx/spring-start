package com.jxx.springstart.chap03.config;

import com.jxx.springstart.chap03.application.ChangePasswordService;
import com.jxx.springstart.chap03.application.MemberRegisterService;
import com.jxx.springstart.chap03.domain.MemberDao;

public class Assembler {
    private MemberDao memberDao;
    private MemberRegisterService registerService;
    private ChangePasswordService changePasswordService;

    public Assembler() {
        memberDao = new MemberDao();
        registerService = new MemberRegisterService(memberDao);
        changePasswordService = new ChangePasswordService();
        changePasswordService.setMemberDao(memberDao);
    }
    public MemberDao getMemberDao() {
        return memberDao;
    }
    public MemberRegisterService getRegisterService() {
        return registerService;
    }
    public ChangePasswordService getChangePasswordService() {
        return changePasswordService;
    }
}
