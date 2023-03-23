package com.jxx.springstart.chap03.config;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;


@Import(TestAppConfig.class)
@SpringBootTest
@AutoConfigureMockMvc
class TestAppConfigTest {

    @Test
    void test() {

        String str = "hello world";

        Assertions.assertThat(str).isEqualTo("hello worId");

        Assertions.assertThatThrownBy(() -> new IllegalAccessException());
    }
}