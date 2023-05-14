package com.wgy.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableDiscoveryClient//可加可不加，依版本而定，从Spring Cloud Edgware开始，@EnableDiscoveryClient可省略。只需加上相关依赖，并进行相应配置，即可将微服务注册到服务发现组件上。
public class StockApplication {
    public static void main(String[] args) {
        SpringApplication.run(StockApplication.class,args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

}
