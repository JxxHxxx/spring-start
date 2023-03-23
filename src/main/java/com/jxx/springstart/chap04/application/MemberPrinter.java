package com.jxx.springstart.chap04.application;

import com.jxx.springstart.chap04.domain.Member;
import org.springframework.beans.factory.annotation.Qualifier;

import java.time.format.DateTimeFormatter;

public class MemberPrinter {
    private DateTimeFormatter dataTimeFormatter;

    public void print(Member member) {
        if (dataTimeFormatter == null) {
            System.out.printf("회원 정보: 아이디=%d, 이메일=%s, 이름=%s 등록일= %tF\n",
                    member.getId(),
                    member.getEmail(),
                    member.getName(),
                    member.getCreateTime());
        }
        else {
            System.out.printf("회원 정보: 아이디=%d, 이메일=%s, 이름=%s 등록일= %tF\n",
                    member.getId(),
                    member.getEmail(),
                    member.getName(),
                    dataTimeFormatter.format(member.getRegisterDataTime()));
        }
    }

    @Qualifier
    public void setDataTimeFormatter(DateTimeFormatter dataTimeFormatter) {
        this.dataTimeFormatter = dataTimeFormatter;
    }
}
