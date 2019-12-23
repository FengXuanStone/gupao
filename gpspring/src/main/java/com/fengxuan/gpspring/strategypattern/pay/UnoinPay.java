package com.fengxuan.gpspring.strategypattern.pay;

public class UnoinPay extends Payment {
    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    public double getBalance(String uid) {
        return 120;
    }
}
