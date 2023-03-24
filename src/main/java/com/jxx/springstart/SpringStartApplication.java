package com.jxx.springstart;

import com.jxx.springstart.chap03.config.AppConfig1;
import com.jxx.springstart.chap03.config.AppConfig2;
import com.jxx.springstart.chap03.config.TestAppConfig;
import com.jxx.springstart.chap03.domain.MemberDao;
import com.jxx.springstart.chap03.domain.MemoryMemberDao;
import com.jxx.springstart.chap03.domain.TestEnvMemberDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

//@Import(TestAppConfig.class)
@SpringBootApplication(scanBasePackages = "com.jxx.springstart.chap04_2")
public class SpringStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringStartApplication.class, args);
    }

}
