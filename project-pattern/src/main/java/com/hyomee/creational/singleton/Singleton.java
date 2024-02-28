package com.hyomee.creational.singleton;

public class Singleton {
    private static Singleton instance;
    private String value;

    private Singleton(String value) {
        System.out.println(value
                + "값으로 Singleton 객체가 셍성 되었습니다");
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        Singleton singleton = instance;
        if (singleton != null) {
            return singleton;
        }
        synchronized(Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
        }
        return instance;
    }

    public String getValue() {
        return this.value;
    }
}
