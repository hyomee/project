package com.hyomee.creational.singleton;

public class StaticBlockInitialization {
    private static StaticBlockInitialization instance;

    private StaticBlockInitialization() {
        System.out.println("Object initialized by static block");
    }

    static {
        try {
            instance = new StaticBlockInitialization();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured");
        }
    }

    public static StaticBlockInitialization getInstance() {
        return instance;
    }
}
