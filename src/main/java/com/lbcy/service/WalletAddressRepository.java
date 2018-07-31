package com.lbcy.service;

import com.lbcy.model.WalletAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 收录的地址
 */
public interface WalletAddressRepository extends JpaRepository<WalletAddress, String>
{
    // 查询所有收录的地址
    @Query(" select w.address from WalletAddress w where w.address <> '' ")
    List<String> findAddress();
}
