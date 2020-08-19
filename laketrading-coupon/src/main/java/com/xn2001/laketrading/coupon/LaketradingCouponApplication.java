package com.xn2001.laketrading.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LaketradingCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(LaketradingCouponApplication.class, args);
    }

}
