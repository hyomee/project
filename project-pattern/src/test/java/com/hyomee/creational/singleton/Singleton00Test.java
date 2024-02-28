package com.hyomee.creational.singleton;

import org.junit.jupiter.api.Test;

class Singleton00Test {

    @Test
    void getInstance() {
        Singleton00 singleton0001 = Singleton00.getInstance("Init_01");
        Singleton00 singleton0002 = Singleton00.getInstance("Init_02");
        System.out.println("singleton01 :: " + singleton0001.getValue());
        System.out.println("singleton02 :: " + singleton0002.getValue());

    }

    @Test
    void multiGetInstance() {
        Runnable singleton_thread_01 = ()-> {
            Singleton00 singleton0001 = Singleton00.getInstance("Init_01");
            System.out.println("singleton01 :: " + singleton0001.getValue());
        };

        Runnable singleton_thread_02 = ()-> {
            Singleton00 singleton0002 = Singleton00.getInstance("Init_02");
            System.out.println("singleton02 :: " + singleton0002.getValue());
        };

        Thread thread01 = new Thread(singleton_thread_01);
        Thread thread02 = new Thread(singleton_thread_02);
        thread01.start();
        thread02.start();
    }

    @Test
    void multiGetInstanceAsync() {
        Runnable singleton_thread_01 = ()-> {
            Singleton singleton01 = Singleton.getInstance("Init_01");
            System.out.println("singleton01 :: " + singleton01.getValue());
        };

        Runnable singleton_thread_02 = ()-> {
            Singleton singleton02 = Singleton.getInstance("Init_02");
            System.out.println("singleton02 :: " + singleton02.getValue());
        };

        Thread thread01 = new Thread(singleton_thread_01);
        Thread thread02 = new Thread(singleton_thread_02);
        thread01.start();
        thread02.start();
    }


}
