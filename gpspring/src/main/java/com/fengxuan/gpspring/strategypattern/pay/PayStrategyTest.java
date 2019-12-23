package com.fengxuan.gpspring.strategypattern.pay;

public class PayStrategyTest {
    public static void main(String[] args) {
        //省略把商品添加到购物车再从购物车下单，直接从订单开始
        Order order = new Order("1", "20191112223333", 324.45);

        System.out.println(order.pay(PayStrategy.ALI_PAY));
    }
}
