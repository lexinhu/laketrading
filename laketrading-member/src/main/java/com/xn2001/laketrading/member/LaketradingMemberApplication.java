package com.xn2001.laketrading.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.xn2001.laketrading.member.feign")
public class LaketradingMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(LaketradingMemberApplication.class, args);
    }

}
