package com.example.demo.model;

import java.io.Serializable;

public class XwBindFlowWithBLOBs extends XwBindFlow implements Serializable {
    private String msg_send;

    private String msg_back;

    private String msg_back_sync;

    private static final long serialVersionUID = 1L;

    public String getMsg_send() {
        return msg_send;
    }

    public void setMsg_send(String msg_send) {
        this.msg_send = msg_send == null ? null : msg_send.trim();
    }

    public String getMsg_back() {
        return msg_back;
    }

    public void setMsg_back(String msg_back) {
        this.msg_back = msg_back == null ? null : msg_back.trim();
    }

    public String getMsg_back_sync() {
        return msg_back_sync;
    }

    public void setMsg_back_sync(String msg_back_sync) {
        this.msg_back_sync = msg_back_sync == null ? null : msg_back_sync.trim();
    }
}