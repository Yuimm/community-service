package com.hct.comm.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.hct.comm.product.dao")
public class CommProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommProductApplication.class, args);
    }

}
