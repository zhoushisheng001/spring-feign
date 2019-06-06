package com.zhuguang.zhou.order.config;

import com.zhuguang.zhou.order.interceptor.AccesInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Bean
    public AccesInterceptor accesInterceptor () {
        return new AccesInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(accesInterceptor()).addPathPatterns("/**");
    }
}
