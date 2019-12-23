package com.fengxuan.gpspring.decoratorpattern;

public class SausageDecorator extends BattercakeDecorator {
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1 根香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
