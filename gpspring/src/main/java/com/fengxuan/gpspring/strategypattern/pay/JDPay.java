package com.fengxuan.gpspring.strategypattern.pay;

public class JDPay extends Payment {
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    public double getBalance(String uid) {
        return 500;
    }
}
