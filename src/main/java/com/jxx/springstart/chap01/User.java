package com.jxx.springstart.chap01;

import java.lang.annotation.Annotation;

@Welcome(mention = "어서오세요!")
@SourceAnnotation
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String welcomeMessage() {
        Welcome annotation = this.getClass().getAnnotation(Welcome.class);
        return this.name + "님 " + annotation.mention();
    }
}
