package com.lbcy.controller;

import com.lbcy.model.WalletAddress;
import com.lbcy.service.WalletAddressRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 李旗 on 2018/5/8 0008
 */
@RestController
public class TestController
{
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private WalletAddressRepository walletAddressRepository;

    @GetMapping("/testController")
    public List<WalletAddress> test() throws Exception
    {
        return walletAddressRepository.findAll();
    }


}
