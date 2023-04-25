package com.jos.dem.kata;

import java.util.Arrays;
import java.util.List;

public class SmallerBiggestFinder {
    public List<Integer> find(List<Integer> numbers) {
        Integer smaller = numbers.stream().reduce((a, b) -> a < b ? a : b).get();
        Integer biggest = numbers.stream().reduce((a, b) -> a > b ? a : b).get();
        return Arrays.asList(smaller, biggest);
    }
}
