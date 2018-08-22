package com.example.demo.dao;

import com.example.demo.model.WalletAddress;
import com.example.demo.model.WalletAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WalletAddressMapper {
    long countByExample(WalletAddressExample example);

    int deleteByExample(WalletAddressExample example);

    int deleteByPrimaryKey(String address);

    int insert(WalletAddress record);

    int insertSelective(WalletAddress record);

    List<WalletAddress> selectByExample(WalletAddressExample example);

    WalletAddress selectByPrimaryKey(String address);

    int updateByExampleSelective(@Param("record") WalletAddress record, @Param("example") WalletAddressExample example);

    int updateByExample(@Param("record") WalletAddress record, @Param("example") WalletAddressExample example);

    int updateByPrimaryKeySelective(WalletAddress record);

    int updateByPrimaryKey(WalletAddress record);
}