package com.zhuguang.zhou.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "order")
public interface OrderFeign {

    @RequestMapping("/getOrderInfo")
    public String getOrderInfo ();

}
