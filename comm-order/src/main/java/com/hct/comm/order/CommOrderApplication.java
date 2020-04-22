package com.hct.comm.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.hct.comm.order.dao")
public class CommOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommOrderApplication.class, args);
    }

}
