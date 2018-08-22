package com.example.demo.service;

import com.example.demo.dao.WalletAddressMapper;
import com.example.demo.model.WalletAddress;
import com.example.demo.model.WalletAddressExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Li qi
 * @create: 2018-08-04 11:25
 **/
@Service
public class WalletAddressService
{
    private final WalletAddressMapper walletAddressMapper;

    @Autowired
    public WalletAddressService(WalletAddressMapper walletAddressMapper)
    {
        this.walletAddressMapper = walletAddressMapper;
    }


    public List<WalletAddress> get()
    {
        WalletAddressExample example = new WalletAddressExample();
        return walletAddressMapper.selectByExample(example);
    }
}
