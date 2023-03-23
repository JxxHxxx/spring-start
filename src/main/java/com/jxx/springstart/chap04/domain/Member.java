package com.jxx.springstart.chap04.domain;

import com.jxx.springstart.chap04.exception.WrongIdPasswordException;

import java.time.LocalDateTime;

public class Member {
    private Long id;
    private String email;
    private String password;
    private String name;
    private LocalDateTime createTime;

    public Member() {
    }

    public Member(String email, String password, String name, LocalDateTime createTime) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.createTime = createTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void changePassword(String oldPassword, String newPassword) {
        if (!password.equals(oldPassword)) {
            throw new WrongIdPasswordException();
        }
        this.password = newPassword;
    }

    public LocalDateTime getRegisterDataTime() {
        return LocalDateTime.now();
    }
}


