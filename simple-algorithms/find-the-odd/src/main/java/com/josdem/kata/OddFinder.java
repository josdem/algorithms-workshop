package com.josdem.kata;

/*
Given an array of integers, find the one that appears an odd number of times.
There will always be only one integer that appears an odd number of times.
 */

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddFinder {
  public int findIt(int[] array) {
    return IntStream.of(array)
        .boxed()
        .collect(Collectors.groupingBy(it -> it, Collectors.counting()))
        .entrySet()
        .stream()
        .filter(it -> it.getValue() % 2 == 1)
        .findFirst()
        .get()
        .getKey();
  }
}
