package com.cty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.cty.dao")
public class ApplicationTest {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationTest.class);
    }
}
