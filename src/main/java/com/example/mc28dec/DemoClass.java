package com.example.mc28dec;

public class DemoClass implements DemoFunctionalInterface {
    @Override
    public void run() {
        System.out.println("Implementing Run method");
    }

    @Override
    public void fly() {
        System.out.println("Fly method in the class");
    }
}
