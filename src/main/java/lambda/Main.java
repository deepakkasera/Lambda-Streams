package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        Animal cat = new Animal() {
//            @Override
//            public void eat() {
//
//            }
//        }

        //Way 3 -> Lambda Expression
        //Java8
        // () -> {}

        Animal cat = () -> { System.out.println("Cat is eating"); };
        //cat.eat();

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if (s.length() > 10) {
                    return true;
                }
                return false;
            }
        };

        // (input parameters) -> {}
        Predicate<String> predicate1 = (input) -> input.length() > 10;
        //System.out.println(predicate1.test("Scaler"));

//        BiFunction<String, String, String>  biFunction = new BiFunction<String, String, String>() {
//            @Override
//            public String apply(String s, String s2) {
//                return null;
//            }
//        }

        BiFunction<String, String, String> biFunction = (s1, s2) -> {
            if (s1.length() > 5) {
                return s1 + s2;
            } else {
                return s2 + s1;
            }
        };
        //System.out.println(biFunction.apply("Sc", "Bangalore"));


        //Problem statement -> Print hello world in a separate thread.
        System.out.println("Hello World, printed by: " + Thread.currentThread().getName());

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World, Printed by: " + Thread.currentThread().getName());
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        Runnable runnable1 = () -> System.out.println("Hello World, Printed by: " + Thread.currentThread().getName());
        Thread thread1 = new Thread(runnable1);
        thread1.start();

        // Interview Problem : Sorting
        List<Integer> numbers = Arrays.asList(1, 5, 2, 4, 3, 10, 7, 8);
        Collections.sort(numbers);
        //System.out.println(numbers);

        Car car1 = new Car("A", 1000, 150);
        Car car2 = new Car("B", 1500, 200);
        Car car3 = new Car("C", 700, 10);
        Car car4 = new Car("D", 800, 20);
        Car car5 = new Car("E", 200, 500);
        Car car6 = new Car("F", 2000, 220);
        List<Car> cars = Arrays.asList(car1, car2, car3, car4, car5, car6);

        Comparator<Car> comparator = (c1, c2) -> c1.power - c2.power;
        //Collections.sort(cars, comparator);

        //System.out.println(cars);

        Stream<Car> stream = cars.stream();
        List<Integer> carPrices = stream.map( (car) -> car.price).collect(Collectors.toList());
        System.out.println(carPrices);
    }
}
