package com.lbcy.bean;

public class BalanceAssets
{
    private String type; // 币种
    private Object balance; // 余额
    private Object assets; // 资产

    public BalanceAssets(String type, Object balance, Object assets)
    {
        this.type = type;
        this.balance = balance;
        this.assets = assets;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public Object getBalance()
    {
        return balance;
    }

    public void setBalance(Object balance)
    {
        this.balance = balance;
    }

    public Object getAssets()
    {
        return assets;
    }

    public void setAssets(Object assets)
    {
        this.assets = assets;
    }
}
