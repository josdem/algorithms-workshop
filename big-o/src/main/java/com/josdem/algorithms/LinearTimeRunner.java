package com.josdem.algorithms;

import java.util.List;

/*  Type: Linear Time Algorithms – O(n)
    Description: Linear increment amount of time based on collection size
 */

public class LinearTimeRunner {
    public List<Integer> getEvenNumbers(List<Integer> numbers) {
        return numbers.stream().filter(it -> it % 2 == 0).toList();
    }
}
