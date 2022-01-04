package com.jos.dem.kata;

/*
Find smaller and biggest numbers in a collection
Given: A collection like [7, 5, 2, 4, 3, 9]
When: I call find method
Then: I will get a collection with [2, 9] values
 */

import java.util.Arrays;
import java.util.List;

public class SmallerBiggestFinder {
  public List<Integer> find(List<Integer> numbers) {
    Integer smaller = numbers.stream().reduce((a, b) -> a < b ? a : b).get();
    Integer biggest = numbers.stream().reduce((a, b) -> a > b ? a : b).get();
    return Arrays.asList(smaller, biggest);
  }
}
