package com.lbcy.bean;

import java.util.List;

/**
 * Created by 李旗 on 2018/6/8
 * eth 根据地址查询正常状态历史交易记录 返回字段集合
 */
public class NormalTransactionsBean
{

    /**
     * status : 1
     * message : OK
     * result : [{"blockNumber":"5660953","timeStamp":"1527045774","hash":"0x5d4ca67ffed525a1adf7723e3e6f93f1f1f35742a19e5707a1e5d902732c7158","nonce":"30","blockHash":"0x6ae9b509ce6b383ab969e9d4833b54726535e0a120dc32948df9b0165fe1dc31","transactionIndex":"124","from":"0xaad7c4d0a68c309312ec2865b33ffc1f15811b07","to":"0x97bd7ae49f25bb515f00cb5293e2bce06a786e1c","value":"20000000000000000","gas":"21000","gasPrice":"10000000000","isError":"0","txreceipt_status":"1","input":"0x","contractAddress":"","cumulativeGasUsed":"7982830","gasUsed":"21000","confirmations":"90808"},{"blockNumber":"5729822","timeStamp":"1528101274","hash":"0xd944682afc37ceab8b5bcf1e77bcd454c8d990596fd7954c7f0fe70bcab79fa6","nonce":"0","blockHash":"0x7292986d7dc086a5fa3e19bb6873b66206ac2ce49fa397f1bbb6a999f4c41bde","transactionIndex":"184","from":"0x97bd7ae49f25bb515f00cb5293e2bce06a786e1c","to":"0x2154df1a70592e7e7b2a16c063dc3f8b815ea8a0","value":"10000000000000000","gas":"21000","gasPrice":"20000000000","isError":"0","txreceipt_status":"1","input":"0x","contractAddress":"","cumulativeGasUsed":"7992831","gasUsed":"21000","confirmations":"21939"},{"blockNumber":"5745507","timeStamp":"1528341134","hash":"0xfbae182d4f15ce4f866dd100b68e7c57a67ec246897ed08a45dbd5640fd40fd1","nonce":"0","blockHash":"0xfefa17316c1b6d4da9a12c511f9d5a64d0f39e81e2ca3451d27b908a1d82ea72","transactionIndex":"97","from":"0x2154df1a70592e7e7b2a16c063dc3f8b815ea8a0","to":"0x97bd7ae49f25bb515f00cb5293e2bce06a786e1c","value":"8000000000000000","gas":"25200","gasPrice":"9100000256","isError":"0","txreceipt_status":"1","input":"0x","contractAddress":"","cumulativeGasUsed":"3568495","gasUsed":"21000","confirmations":"6254"}]
     */

    private String status;
    private String message;
    private List<ResultBean> result;

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public List<ResultBean> getResult()
    {
        return result;
    }

    public void setResult(List<ResultBean> result)
    {
        this.result = result;
    }

    public static class ResultBean
    {
        /**
         * blockNumber : 5660953
         * timeStamp : 1527045774
         * hash : 0x5d4ca67ffed525a1adf7723e3e6f93f1f1f35742a19e5707a1e5d902732c7158
         * nonce : 30
         * blockHash : 0x6ae9b509ce6b383ab969e9d4833b54726535e0a120dc32948df9b0165fe1dc31
         * transactionIndex : 124
         * from : 0xaad7c4d0a68c309312ec2865b33ffc1f15811b07
         * to : 0x97bd7ae49f25bb515f00cb5293e2bce06a786e1c
         * value : 20000000000000000
         * gas : 21000
         * gasPrice : 10000000000
         * isError : 0
         * txreceipt_status : 1
         * input : 0x
         * contractAddress :
         * cumulativeGasUsed : 7982830
         * gasUsed : 21000
         * confirmations : 90808
         */

        private String blockNumber;
        private String timeStamp;
        private String hash;
        private String nonce;
        private String blockHash;
        private String transactionIndex;
        private String from;
        private String to;
        private String value;
        private String gas;
        private String gasPrice;
        private String isError;
        private String txreceipt_status;
        private String input;
        private String contractAddress;
        private String cumulativeGasUsed;
        private String gasUsed;
        private String confirmations;

        public String getBlockNumber()
        {
            return blockNumber;
        }

        public void setBlockNumber(String blockNumber)
        {
            this.blockNumber = blockNumber;
        }

        public String getTimeStamp()
        {
            return timeStamp;
        }

        public void setTimeStamp(String timeStamp)
        {
            this.timeStamp = timeStamp;
        }

        public String getHash()
        {
            return hash;
        }

        public void setHash(String hash)
        {
            this.hash = hash;
        }

        public String getNonce()
        {
            return nonce;
        }

        public void setNonce(String nonce)
        {
            this.nonce = nonce;
        }

        public String getBlockHash()
        {
            return blockHash;
        }

        public void setBlockHash(String blockHash)
        {
            this.blockHash = blockHash;
        }

        public String getTransactionIndex()
        {
            return transactionIndex;
        }

        public void setTransactionIndex(String transactionIndex)
        {
            this.transactionIndex = transactionIndex;
        }

        public String getFrom()
        {
            return from;
        }

        public void setFrom(String from)
        {
            this.from = from;
        }

        public String getTo()
        {
            return to;
        }

        public void setTo(String to)
        {
            this.to = to;
        }

        public String getValue()
        {
            return value;
        }

        public void setValue(String value)
        {
            this.value = value;
        }

        public String getGas()
        {
            return gas;
        }

        public void setGas(String gas)
        {
            this.gas = gas;
        }

        public String getGasPrice()
        {
            return gasPrice;
        }

        public void setGasPrice(String gasPrice)
        {
            this.gasPrice = gasPrice;
        }

        public String getIsError()
        {
            return isError;
        }

        public void setIsError(String isError)
        {
            this.isError = isError;
        }

        public String getTxreceipt_status()
        {
            return txreceipt_status;
        }

        public void setTxreceipt_status(String txreceipt_status)
        {
            this.txreceipt_status = txreceipt_status;
        }

        public String getInput()
        {
            return input;
        }

        public void setInput(String input)
        {
            this.input = input;
        }

        public String getContractAddress()
        {
            return contractAddress;
        }

        public void setContractAddress(String contractAddress)
        {
            this.contractAddress = contractAddress;
        }

        public String getCumulativeGasUsed()
        {
            return cumulativeGasUsed;
        }

        public void setCumulativeGasUsed(String cumulativeGasUsed)
        {
            this.cumulativeGasUsed = cumulativeGasUsed;
        }

        public String getGasUsed()
        {
            return gasUsed;
        }

        public void setGasUsed(String gasUsed)
        {
            this.gasUsed = gasUsed;
        }

        public String getConfirmations()
        {
            return confirmations;
        }

        public void setConfirmations(String confirmations)
        {
            this.confirmations = confirmations;
        }
    }
}
