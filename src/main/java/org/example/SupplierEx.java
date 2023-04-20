package org.example;

public class SupplierEx {
    public static void main(String[] args) {
        java.util.function.Supplier<String> myStringSupplier = () -> "hello world!";
        System.out.println(myStringSupplier.get());

        java.util.function.Supplier<Double> myRandomDoubleSupplier = () -> Math.random();
//        System.out.println(myRandomDoubleSupplier.get());
//        System.out.println(myRandomDoubleSupplier.get());
//        System.out.println(myRandomDoubleSupplier.get());
        printRandomDoubles(myRandomDoubleSupplier, 5);

    }

    public static void printRandomDoubles(java.util.function.Supplier<Double> randomSupplier, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(randomSupplier.get());
        }
    }
}
