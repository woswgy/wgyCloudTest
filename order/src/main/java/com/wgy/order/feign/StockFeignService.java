package com.wgy.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "stockServer",path = "/stock")
public interface StockFeignService {

    @RequestMapping("/test")
    public String stock();
}
