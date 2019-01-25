package com.example.maven201901251606.controller;

import com.example.maven201901251606.dao.XwBindFlowMapper;
import com.example.maven201901251606.model.XwBindFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : qi.li
 * @date : 2019/1/25 17
 */
@RestController
public class TestController
{
    @Autowired
    private XwBindFlowMapper bindFlowMapper;

    @GetMapping("/flow")
    public XwBindFlow getXwBindFlow()
    {
        return bindFlowMapper.selectByPrimaryKey("201901071509060893");
    }
}
