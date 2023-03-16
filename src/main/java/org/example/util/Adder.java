package org.example.util;

import java.util.function.Function;

public class Adder implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer integr) {
        return integr + 10;
    }
}
