package com.fengxuan.gpspring.strategypattern.pay;

public class WechatPay extends Payment {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    public double getBalance(String uid) {
        return 256;
    }
}
