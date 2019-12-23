package com.fengxuan.gpspring.strategypattern.pay;

import lombok.Data;

@Data
public class PayState {
    private int code;
    private Object data;
    private String msg;

    public PayState(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
