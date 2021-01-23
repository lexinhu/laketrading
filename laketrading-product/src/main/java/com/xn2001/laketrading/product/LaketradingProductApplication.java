package com.xn2001.laketrading.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients("com.xn2001.laketrading.product.feign")
@SpringBootApplication
@MapperScan("com.xn2001.laketrading.product.dao")
public class LaketradingProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(LaketradingProductApplication.class, args);
    }

}
