package com.fengxuan.gpspring.proxypattern;

public class ProxyTest {
    public static void main(String[] args) {
//        Father father = new Father(new Son());
//        father.findLove();
        try {
            Person obj = (Person) new JDKMeipo().getInstance(new Customer());
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
