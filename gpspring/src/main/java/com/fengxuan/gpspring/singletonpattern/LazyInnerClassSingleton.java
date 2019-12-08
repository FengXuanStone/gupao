package com.fengxuan.gpspring.singletonpattern;

public class LazyInnerClassSingleton {
    //使用lazyInnerClassGeneral的时候，默认会先初始化内部类
    //如果没使用，则内部类是不加载的
    private LazyInnerClassSingleton() {
        if(LazyHolder.LAZY != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY;
    }

    //默认不加载
    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
