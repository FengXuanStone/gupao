package com.fengxuan.gpspring.singletonpattern.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSigleton {
    private ContainerSigleton() {

    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String beanName) {
        synchronized (ioc) {
            if(!ioc.containsKey(beanName)) {
                Object obj = null;
                try {
                    obj = Class.forName(beanName).newInstance();
                    ioc.put(beanName, obj);
                    return obj;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return ioc.get(beanName);
    }

}
