package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

public class WalletAddress implements Serializable {
    private String address;

    private Date create_time;

    private static final long serialVersionUID = 1L;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}