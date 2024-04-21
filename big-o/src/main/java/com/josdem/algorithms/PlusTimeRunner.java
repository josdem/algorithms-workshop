package com.josdem.algorithms;

import java.util.Arrays;
import java.util.List;

/*  Type: Plus Time Algorithms – O(2a + b)
    Description: Plus compute time algorithm
 */
public class PlusTimeRunner {

    public List<Integer> createNewList(List<Integer> numbers) {
        int min = numbers.stream().min(Integer::compare).orElseThrow(() -> new RuntimeException("No min value was found"));
        int max = numbers.stream().max(Integer::compare).orElseThrow(() -> new RuntimeException("No max value was found"));
        return Arrays.asList(new Integer[max - min + 1]);
    }
}
