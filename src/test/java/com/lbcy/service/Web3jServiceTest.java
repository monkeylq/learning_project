package com.lbcy.service;

import com.google.gson.Gson;
import com.lbcy.dao.WalletAddressRepository;
import com.lbcy.dao.WalletBlockParamsRepository;
import com.lbcy.dao.WalletTypesRepository;
import com.lbcy.model.WalletAddress;
import com.lbcy.model.WalletBlockParams;
import com.lbcy.model.WalletTypes;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by 李旗 on 2018/5/30 0030
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Web3jServiceTest
{

    @Autowired
    private Web3jService web3jService;

    @Autowired
    private CoinMarketService coinMarketService;
    //bpx
    @Autowired
    private RfinexService rfinexService;

    @Autowired
    private BpxService bpxService;
    @Autowired
    private EtcService etcService;
    @Autowired
    private WalletAddressRepository walletAddressRepository;
    @Autowired
    private WalletBlockParamsRepository walletBlockParamsRepository;
    @Autowired
    private WalletTypesRepository walletTypesRepository;

    @Test
    public void getGasPrice() throws Exception
    {

//        List<WalletBlockParams> all = walletBlockParamsRepository.findAll();


//        String txHash = "0x29502493c099b1cb8da70469d1531845ef85917befdcdf142352cbea74cc9c2c"; // bpx
        String txHash = "0x2ef4ea3fb63c302f1dccfa58a8abe1d564169c220654027e815d737acb7458d5"; // bpx
//        String txHash = "0xd944682afc37ceab8b5bcf1e77bcd454c8d990596fd7954c7f0fe70bcab79fa6";  // eth
//        Web3j web3j = Web3j.build(new HttpService("http://13.125.170.24:22003"));
////        Web3j web3j = Web3j.build(new HttpService("https://mainnet.infura.io/your-token"));
//        EthTransaction ethTransaction = web3j.ethGetTransactionByHash(txHash).sendAsync().get();
//
//        Optional<Transaction> transaction = ethTransaction.getTransaction();
//        Transaction tran = transaction.get();
//        System.out.println("tran: " + new Gson().toJson(tran));
//
//        BigDecimal bigDecimal = Convert.fromWei(tran.getValue().toString(), Convert.Unit.ETHER);
//

    }


}