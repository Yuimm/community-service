package com.hct.comm.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.hct.comm.coupon.dao")
public class CommCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommCouponApplication.class, args);
    }

}
