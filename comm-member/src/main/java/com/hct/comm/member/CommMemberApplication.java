package com.hct.comm.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.hct.comm.member.dao")
public class CommMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommMemberApplication.class, args);
    }

}
