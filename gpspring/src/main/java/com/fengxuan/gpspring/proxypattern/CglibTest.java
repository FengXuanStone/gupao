package com.fengxuan.gpspring.proxypattern;

import net.sf.cglib.core.DebuggingClassWriter;

public class CglibTest {
    public static void main(String[] args) {
        try {
            //利用CGLib的代理类可以将内存中的.class文件写入本地磁盘
            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "E:\\code\\gupao\\gpspring\\src\\tmp\\cglib_proxy_class");

            Customer obj = (Customer) new CglibMeipo().getInstance(Customer.class);
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
