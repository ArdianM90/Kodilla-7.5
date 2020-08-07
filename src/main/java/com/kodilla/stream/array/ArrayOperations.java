package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        //Miało być przy użyciu IntStream i tablicy, ale tak nie było by lepiej?
//        double avg = Arrays.stream(numbers).average().getAsDouble();
//        return avg;

        IntStream.range(0, numbers.length).map(n -> numbers[n]).forEach(System.out::println);
        return IntStream.range(0, numbers.length).map(n -> numbers[n]).average().getAsDouble();
    };
}
