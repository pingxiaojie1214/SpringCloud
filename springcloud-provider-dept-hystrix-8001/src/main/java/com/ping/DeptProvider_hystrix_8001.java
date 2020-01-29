package com.ping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//启动类
@EnableDiscoveryClient
@EnableEurekaClient //服务启动会自动注入到Eureka注册中心。
@SpringBootApplication
//添加对熔断的支持
@EnableCircuitBreaker
public class DeptProvider_hystrix_8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_hystrix_8001.class,args);
    }
}
