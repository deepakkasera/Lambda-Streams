package com.example.mc28dec;

public class Main {
    public static void main(String[] args) {
        //DemoFunctionalInterface obj = new DemoFunctionalInterface();

        //Way1 -> Create a class that implements the interface.
        DemoClass obj1 = new DemoClass();
        obj1.run();
        obj1.fly();
//        obj1.walk();
//        DemoFunctionalInterface.eat();

        //Way2 -> Anonymous Class.
        DemoFunctionalInterface obj2 = new DemoFunctionalInterface() {
            @Override
            public void run() {
                System.out.println("Anonymous way");
            }

            @Override
            public void fly() {
                System.out.println("Fly method in Anonymous class");
            }
        };
        obj2.run();
        obj2.fly();
    }
}
