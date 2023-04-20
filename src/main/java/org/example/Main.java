package org.example;

import org.example.util.Adder;
import org.example.util.TriFunction;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        /**
         *  testt
         *  Funtional InterFace input 1개일떄
         */
        Function<Integer, Integer> myAdder = new Adder();
        int result = myAdder.apply(5);
        System.out.println(result);

        Function<Integer, Integer> myAdder2 = x -> x + 10;

        int result2 = myAdder2.apply(10);
        System.out.println(result2);

        BiFunction<Integer, Integer, Integer> add =(x,  y) -> x + y;

        int result3 = add.apply(3, 5);
        System.out.println(result3);

        TriFunction<Integer, Integer, Integer, Integer> myAdder3 = (x, y, z) -> x + y + z;

        int result4 = myAdder3.apply(3, 5, 6);
        System.out.println(result4);

        /**
         *
         *  Supplier
         */
        System.out.println("================");
        Supplier<String> myStringSupplier = () -> "hello world!";
        System.out.println(myStringSupplier.get());
    }
}