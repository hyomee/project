package com.hyomee.creational.builder;

public class CutomerBuilder {
    private String name;
    private String age;

    public CutomerBuilder name(String name) {
        this.name = name;
        return this;
    }

    public CutomerBuilder age(String age) {
        this.age = age;
        return this;
    }

    public CutomerVO build() {
        return new CutomerVO(
                this.name,
                this.age );
    }
}
