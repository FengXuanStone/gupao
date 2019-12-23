package com.fengxuan.gpspring.decoratorpattern;

public class BattercakeTest {
    public static void main(String[] args) {
        Battercake battercake;
        battercake = new BaseBattercake();
        battercake = new EggDecorator(battercake);
        battercake = new EggDecorator(battercake);
        battercake = new SausageDecorator(battercake);

        System.out.println(battercake.getMsg() + ",总价格：" + battercake.getPrice());
    }
}
