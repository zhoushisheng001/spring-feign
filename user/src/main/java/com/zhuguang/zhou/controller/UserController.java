package com.zhuguang.zhou.controller;

import com.zhuguang.zhou.feign.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private OrderFeign orderFeign;

    @RequestMapping("/getUserInfo")
    public String getUserInfo () {
        System.out.println("============getUserInfo==========");
        String orderInfo = orderFeign.getOrderInfo();
        return orderInfo;
    }
}
