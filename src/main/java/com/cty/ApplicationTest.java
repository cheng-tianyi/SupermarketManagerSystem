package com.cty;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.cty.dao")
public class ApplicationTest {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationTest.class);
    }
}
