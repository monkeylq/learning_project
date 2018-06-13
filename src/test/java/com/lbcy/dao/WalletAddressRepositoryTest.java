package com.lbcy.dao;

import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WalletAddressRepositoryTest
{

    @Autowired
    private WalletAddressRepository addressRepository;

    @Test
    public void findAllAddress()
    {

        String s = "0x97c1a6fa70da3b5667d670958881dada9abd1e87".toLowerCase();
        System.out.println(s);

    }
}