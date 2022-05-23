package com.tulingxuwyuan.order.controller;

import com.tulingxuwyuan.order.service.ProductFeignService;
import com.tulingxuwyuan.order.service.StockService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class OderController {

    @Resource
    StockService stockService;
    @Resource
    ProductFeignService productFeignService;
    @GetMapping(value = "/add")
    public String add() {
        System.out.println("下单成功");
        String msg = stockService.reduct();
        String s = productFeignService.get(1);
        //restTemplate.getForObject("http://localhost:8011/stock/reduce", String.class);
        return "下单成功"+msg+s;
    }

}
