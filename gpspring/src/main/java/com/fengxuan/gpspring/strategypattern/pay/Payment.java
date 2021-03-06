package com.fengxuan.gpspring.strategypattern.pay;

public abstract class Payment {
    //支付类型
    public abstract String getName();

    //查询余额
    public abstract double getBalance(String uid);

    //扣款支付
    public PayState pay(String uid, double amount) {
        if(getBalance(uid) < amount) {
            return new PayState(500, "支付失败", "余额不足");
        }
        return new PayState(200, "支付成功","支付金额：" + amount);
    }
}
