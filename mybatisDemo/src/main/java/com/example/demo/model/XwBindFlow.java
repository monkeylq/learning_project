package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

public class XwBindFlow implements Serializable {
    private String bank_card_id;

    private String user_id;

    private String type;

    private String channel_code;

    private Integer status;

    private String local_url;

    private Date create_time;

    private Date update_time;

    private static final long serialVersionUID = 1L;

    public String getBank_card_id() {
        return bank_card_id;
    }

    public void setBank_card_id(String bank_card_id) {
        this.bank_card_id = bank_card_id == null ? null : bank_card_id.trim();
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id == null ? null : user_id.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getChannel_code() {
        return channel_code;
    }

    public void setChannel_code(String channel_code) {
        this.channel_code = channel_code == null ? null : channel_code.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLocal_url() {
        return local_url;
    }

    public void setLocal_url(String local_url) {
        this.local_url = local_url == null ? null : local_url.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}