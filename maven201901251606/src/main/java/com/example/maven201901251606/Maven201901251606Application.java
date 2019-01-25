package com.example.maven201901251606;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 扫包
@SpringBootApplication(scanBasePackages = {"com.example.maven201901251606"})
// mapper文件
@MapperScan(basePackages = "com.example.maven201901251606.dao")
public class Maven201901251606Application
{


    public static void main(String[] args)
    {
        System.out.println("hello world");
        SpringApplication.run(Maven201901251606Application.class, args);
    }

}

