package com.lbcy.bean;

import com.google.gson.Gson;

/**
 * Created by 李旗 on 2018/5/9 0009
 * 以太坊 参数 bean
 */
public class QueryBean
{
    private String outAddress; // 转出地址
    private String inAddress; // 转入地址
    private String address; // 地址
    private String amt; // 转账金额
    private String publicKey; // 公钥
    private String signedMessage; // 签名报文
    private String type; // 类型
    private String txHash; // 订单号

    public String getTxHash()
    {
        return txHash;
    }

    public void setTxHash(String txHash)
    {
        this.txHash = txHash;
    }

    public String getOutAddress()
    {
        return outAddress;
    }

    public void setOutAddress(String outAddress)
    {
        this.outAddress = outAddress;
    }

    public String getInAddress()
    {
        return inAddress;
    }

    public void setInAddress(String inAddress)
    {
        this.inAddress = inAddress;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAmt()
    {
        return amt;
    }

    public void setAmt(String amt)
    {
        this.amt = amt;
    }

    public String getPublicKey()
    {
        return publicKey;
    }

    public void setPublicKey(String publicKey)
    {
        this.publicKey = publicKey;
    }

    public String getSignedMessage()
    {
        return signedMessage;
    }

    public void setSignedMessage(String signedMessage)
    {
        this.signedMessage = signedMessage;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return new Gson().toJson(this);
    }
}
