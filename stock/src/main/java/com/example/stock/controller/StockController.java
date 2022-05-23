package com.example.stock.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {

    @RequestMapping("/reduce")
    public String reduce(){
        System.out.println("减少库存成功");
        return "减少库存成功";
    }

}
