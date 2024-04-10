package com.josdem.kata;

import java.util.Arrays;
import java.util.List;
public class NumbersCounter {
    public List<Integer> count(List<Integer> numbers) {
        return Arrays.asList(
                (int) numbers.stream().filter(n -> n > 0).count(),
                (int) numbers.stream().filter(n -> n < 0).count(),
                (int) numbers.stream().filter(n -> n == 0).count());
    }
}
