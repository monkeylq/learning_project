package com.lbcy.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class WalletAddress
{

    @Id
    private String address;

    private Date createTime;

    public WalletAddress()
    {
    }

    public WalletAddress(String address)
    {
        this.address = address;
    }

    public WalletAddress(String address, Date date)
    {
        this.address = address;
        this.createTime = date;
    }

    public Date getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
}
