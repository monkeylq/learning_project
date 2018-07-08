package com.lbcy.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig
{
    private
    @Value("${etc.serviceUrl}")
    String serviceUrl;

    @Bean
    public String getBeanConfig()
    {
        System.out.println("MyConfig"+serviceUrl);
        return serviceUrl;
    }


}
