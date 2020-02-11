package com.fengxuan.gpspring.singletonpattern.seriable;

import java.io.Serializable;

public class SeriableSingleton implements Serializable {
    private final static SeriableSingleton instance = new SeriableSingleton();

    private SeriableSingleton() {

    }

    public static SeriableSingleton getInstance() {
        return instance;
    }

    private Object readResolve() {
        return instance;
    }
}
