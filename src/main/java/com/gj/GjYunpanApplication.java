package com.gj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gj.dao")
public class GjYunpanApplication {

    public static void main(String[] args) {
        SpringApplication.run(GjYunpanApplication.class, args);
    }

}
