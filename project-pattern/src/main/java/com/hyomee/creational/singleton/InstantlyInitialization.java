package com.hyomee.creational.singleton;

public class InstantlyInitialization {
    private static InstantlyInitialization instance = new InstantlyInitialization();

    private InstantlyInitialization() {
    }

    public static InstantlyInitialization getInstance() {
        return instance;
    }
}
