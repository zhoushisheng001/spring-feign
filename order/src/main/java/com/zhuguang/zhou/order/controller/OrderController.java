package com.zhuguang.zhou.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {


    @RequestMapping("/getOrderInfo")
    public String getOrderInfo () {
        System.out.println("======getOrderInfo=======");
        return "scuess";
    }
}
