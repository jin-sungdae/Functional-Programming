package org.example.MethodReference;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class MehtodR {

    public static int calculate (int x, int y, BiFunction<Integer, Integer, Integer> operator) {
        return operator.apply(x, y);
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }
    public static void main(String[] args) {
        int a = Integer.parseInt("15");
        Function<String, Integer> str2int = Integer::parseInt;
        int b = str2int.apply("13");
        System.out.println(a + "  " + b);

        String str = "hello";
        boolean c = str.equals("world");
        Predicate<String> equalsToHello = str::equals;
        boolean d = equalsToHello.test("world2");
        System.out.println(c + "  : " + d);

        System.out.println(calculate(8, 2, (x, y) -> x + y));

        System.out.println(calculate(8, 2, MehtodR::multiply));

        System.out.println(calculate(8, 2, MehtodR::subtract));
    }
}
