package com.fengxuan.gpspring.proxypattern.danimic;

import com.fengxuan.gpspring.proxypattern.Person;

public class Girl implements Person {
    @Override
    public void findLove() {
        System.out.println("girl find love");
    }
}
