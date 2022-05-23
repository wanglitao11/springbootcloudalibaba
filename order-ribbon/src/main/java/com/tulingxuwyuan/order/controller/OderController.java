package com.tulingxuwyuan.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class OderController {

    @Resource
    RestTemplate restTemplate;
    @GetMapping(value = "/add")
    public String add() {
        System.out.println("下单成功");
        String msg = restTemplate.getForObject("http://stock-service/stock/reduct", String.class);
        return "下单成功"+msg;
    }

}
