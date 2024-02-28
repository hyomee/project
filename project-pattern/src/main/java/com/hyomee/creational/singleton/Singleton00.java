package com.hyomee.creational.singleton;

public class Singleton00 {
    private static Singleton00 instance;
    private String value;

    private Singleton00(String value) {
        System.out.println(value
                + " 값으로 Singleton 객체가 셍성 되었습니다");
        this.value = value;
    }

    public static Singleton00 getInstance(String value) {
        if (instance == null) {
            instance = new Singleton00(value);
        }
        return instance;
    }

    public String getValue() {
        return this.value;
    }
}
