package com.hyomee.creational.singleton;

public class SynchronizedSingleton {
    private volatile static SynchronizedSingleton instance;

    private SynchronizedSingleton() {
    }

//    public synchronized static SynchronizedSingleton getInstance() {
//        if (null == instance) {
//            instance = new SynchronizedSingleton();
//        }
//        return instance;
//    }

    public static SynchronizedSingleton getInstance() {
        if (null == instance) {
            synchronized (SynchronizedSingleton.class) {
                if (null == instance) {
                    instance = new SynchronizedSingleton();
                }
            }
        }
        return instance;
    }
}
