package com.example.mc28dec;

public interface DemoFunctionalInterface {
    void run(); // abstract method -> Method without body.
    //SAM

    void fly();

    default void walk() {
        System.out.println("Walking");
    }

    static void eat() {
        System.out.println("eating");
    }
}
