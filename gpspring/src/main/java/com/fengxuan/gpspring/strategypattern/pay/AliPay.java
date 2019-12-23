package com.fengxuan.gpspring.strategypattern.pay;

public class AliPay extends Payment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    public double getBalance(String uid) {
        return 900;
    }
}
