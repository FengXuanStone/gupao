package com.fengxuan.gpspring.singletonpattern.threadlocalSingleton;

public class ThreadLocalSingleton {
    private ThreadLocalSingleton() {

    }

    private static ThreadLocal<ThreadLocalSingleton> threadLocalSingletonThreadLocal =
            new ThreadLocal<ThreadLocalSingleton>() {
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    public ThreadLocalSingleton getInstance() {
        return threadLocalSingletonThreadLocal.get();
    }
}
