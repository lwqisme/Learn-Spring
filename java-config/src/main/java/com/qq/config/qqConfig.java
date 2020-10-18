package com.qq.config;

import com.qq.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//使用java文件作为bean.xml来用
@Configuration
@ComponentScan("com.qq.pojo")
public class qqConfig {
    //注册一个Bean
    //方法名就是相当于id
    //返回值相当于class
    @Bean
    public User getUser(){
        return new User();
    }
}
