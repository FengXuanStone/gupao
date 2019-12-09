package com.fengxuan.gpspring.proxypattern;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class JDKProxyTest {
    public static void main(String[] args) {
        try {
            Person obj = (Person) new JDKMeipo().getInstance(new Customer());
            obj.findLove();

            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
            FileOutputStream fos = new FileOutputStream("/Users/fengxuan/code/source_code/gupao/gpspring/src/tmp/$Proxy0.class");
            fos.write(bytes);
            fos.flush();
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
