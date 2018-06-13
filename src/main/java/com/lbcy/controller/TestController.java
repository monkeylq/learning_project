package com.lbcy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by 李旗 on 2018/5/8 0008
 */
@RestController
public class TestController
{
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);


    @GetMapping("/testController")
    public String test(HttpSession session) throws Exception
    {
        logger.info("test success enter");
        return "success";
    }


}
