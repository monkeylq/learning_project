package com.example.demo.service;

import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WalletAddressServiceTest
{
    @Autowired
    WalletAddressService walletAddressService;

    @Test
    public void get()
    {
        System.out.println(new Gson().toJson(walletAddressService.get()));
        System.out.println("size:" + new Gson().toJson(walletAddressService.get().size()));
    }

}