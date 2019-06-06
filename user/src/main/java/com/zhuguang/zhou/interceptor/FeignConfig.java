package com.zhuguang.zhou.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        //添加Cookie数据
        requestTemplate.header("Cookie","token=rl8zynt141dz1whggxvo5cup6");
    }
}
