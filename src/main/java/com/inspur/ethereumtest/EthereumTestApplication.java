package com.inspur.ethereumtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.inspur.ethereumtest.mapper")
public class EthereumTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(EthereumTestApplication.class, args);
    }

}
