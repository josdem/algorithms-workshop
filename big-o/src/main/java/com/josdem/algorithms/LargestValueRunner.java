package com.josdem.algorithms;

import java.util.List;

/*  Type: Largest number in the array Algorithm – O(n * k)
    Description: Largest number in the collection
 */

public class LargestValueRunner {

    public int getNumber(List<Integer> numbers) {
        return numbers.stream().filter(it -> it % 2 == 0).max(Integer::compare).orElseThrow(() -> new RuntimeException("No number was found"));
    }
}
