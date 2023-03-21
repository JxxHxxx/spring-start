package com.jxx.springstart.chap03.config;

import com.jxx.springstart.chap03.application.ChangePasswordService;
import com.jxx.springstart.chap03.application.MemberRegisterService;
import com.jxx.springstart.chap03.domain.MemoryMemberDao;

public class Assembler {
    private MemoryMemberDao memberDao;
    private MemberRegisterService registerService;
    private ChangePasswordService changePasswordService;

    public Assembler() {
        memberDao = new MemoryMemberDao();
        registerService = new MemberRegisterService(memberDao);
        changePasswordService = new ChangePasswordService();
        changePasswordService.setMemberDao(memberDao);
    }
    public MemoryMemberDao getMemberDao() {
        return memberDao;
    }
    public MemberRegisterService getRegisterService() {
        return registerService;
    }
    public ChangePasswordService getChangePasswordService() {
        return changePasswordService;
    }
}
