package com.lbcy.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by 李旗 on 2018/6/8 0008
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EthDeveloperAPIsTest
{

    @Autowired
    private EthDeveloperAPIs ethDeveloperAPIs;

    @Test
    public void getTransferInfoByAddress() throws Exception
    {
        ethDeveloperAPIs.getTransferInfoByAddress("0x97bD7aE49F25BB515f00cb5293e2BCE06A786e1c");
    }

}