package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {
    public static void main(String[] args) {
        java.util.function.Consumer<String> myStringConsumer = (String str) -> {
            System.out.println(str);
        };
        myStringConsumer.accept("hello");

        List<Integer> integerInputs = Arrays.asList(4, 2 , 3);
        java.util.function.Consumer<Integer> myIntegerProcessor = (Integer x) -> System.out.println("Processing integer " + x);
        process(integerInputs, myIntegerProcessor);
        java.util.function.Consumer<Integer> myDifferentIntegerProcessor = x -> System.out.println("Processing integer in different way " + x);
        process(integerInputs, myDifferentIntegerProcessor);
        java.util.function.Consumer<Double> myDoubleProcessor = x -> System.out.println("Processing double " + x);
        List<Double> doubleInputs = Arrays.asList(1.1, 2.2, 3.3);
        process(doubleInputs, myDoubleProcessor);
    }

    public static <T>void process(List<T> inputs, Consumer<T> processor) {
        for (T input: inputs) {
            processor.accept(input);
        }
    }
}
