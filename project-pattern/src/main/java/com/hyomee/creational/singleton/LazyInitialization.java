package com.hyomee.creational.singleton;

public class LazyInitialization {
    private static LazyInitialization instance = null;

    private LazyInitialization() {
    }

    public static LazyInitialization getInstance() {
        if (instance == null) {
            instance = new LazyInitialization();
        }
        return instance;
    }
}
