package com.hct.comm.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.hct.comm.ware.dao")
public class CommWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommWareApplication.class, args);
    }

}
