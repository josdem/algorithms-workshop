package com.josdem.kata;

import java.util.Arrays;
import java.util.List;

public class SmallerBiggestFinder {
    public List<Integer> find(List<Integer> numbers) {
        Integer smaller = numbers.stream().min(Integer::compare).orElse(0);
        Integer biggest = numbers.stream().max(Integer::compare).orElse(0);
        return Arrays.asList(smaller, biggest);
    }
}
