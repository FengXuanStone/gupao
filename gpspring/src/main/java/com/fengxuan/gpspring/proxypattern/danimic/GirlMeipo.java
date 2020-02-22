package com.fengxuan.gpspring.proxypattern.danimic;

import com.fengxuan.gpspring.proxypattern.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class GirlMeipo implements InvocationHandler {

    private Person target;
    public Object getInstance(Person person) throws Exception{
        this.target = person;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target, args);
    }

    private void before() {

    }

    private void after() {

    }
}
