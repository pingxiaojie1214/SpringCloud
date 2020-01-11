package com.ping.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {//@Configuration --spring applicationContext.xml
    //配置负载均衡实现RestTemplate
    //IRule
    //RoundRobinRule 轮询
    //RandomRule 随机
    //AvailabilityFliteringRule:先过滤掉，跳闸，访问故障的服务，对剩下的进行轮询。
    //RetryRule:先按轮询的方式获取服务，如果服务获取失败，则会在指定的时间时间内进行重试。
    @Bean
    @LoadBalanced //Ribbon实现负载均衡（默认轮询方式）
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


    @Bean
    public IRule myRule(){
        return new RandomRule();
    }

}
