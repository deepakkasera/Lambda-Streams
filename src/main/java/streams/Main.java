package streams;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 6, 4, 2, 10, 7);

        //Way1
        Stream<Integer> stream = numbers.stream(); //pipeline

//        //Way2
//        Integer[] numbers1 = {1, 5, 6, 4, 2, 10, 7};
//        Stream<Integer> stream1 = Arrays.stream(numbers1);
//
//        //Way3
//        Stream<Integer> stream2 = Stream.of(1, 5, 6, 4, 2, 10, 7);
//
//        //Way4
//        Stream.Builder<Integer> streamBuilder = Stream.builder();
//        streamBuilder.add(10);
//        streamBuilder.add(5);
//        streamBuilder.add(1);
//        streamBuilder.add(2);

        //Task is to get only odd numbers from the list.
        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer i : numbers) {
            if (i%2 == 1) {
                oddNumbers.add(i);
            }
        }
        //System.out.println(oddNumbers);

        //Using Streams
        List<Integer> output = stream.filter((num) -> num%2 == 1).collect(Collectors.toList());
        System.out.println(output);
    }
}
