package com.wgy.stock.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/test")
    public String stock(){
        System.out.println("test");
        return "test:"+port;
    }
}
