package com.lbcy.dao;

import com.google.gson.Gson;
import com.lbcy.model.EthTransactionDb;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.web3j.utils.Convert;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EthTransactionRepositoryTest
{

    @Autowired
    private EthTransactionRepository transactionRepository;

    @Test
    public void findAllByTFromEqualsAndTypeEquals()
    {
        String address = "0x2154df1a70592e7e7b2a16c063dc3f8b815ea8a0";
        String type = "1";
//        List<EthTransactionDb> transactionDbList = transactionRepository.findAllByTFromEqualsAndTypeEquals(address, type);
//        System.out.println(new Gson().toJson(transactionDbList));


        BigDecimal value = Convert.fromWei("8000000000000000", Convert.Unit.ETHER);
        System.out.println(value);

    }
}