package org.example.MethodReference;

import java.util.function.Function;

public class MehtodR {
    public static void main(String[] args) {
        int a = Integer.parseInt("15");
        Function<String, Integer> str2int = Integer::parseInt;
        int b = str2int.apply("13");
        System.out.println(a + "  " + b);
    }
}
