package com.wgy.order.controller;

import com.wgy.order.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
@RefreshScope//这个可以动态的感知配置值的变化并获取，否则不会动态的获取到值
public class OrderController {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private StockFeignService stockFeignService;


    @RequestMapping("/add")
    public String add(){
//        String msg = restTemplate.getForObject("http://stockServer/stock/test",String.class);
        String msg = stockFeignService.stock();
        System.out.println("下单成功！");
     return "Hello "+msg;
    }



}
