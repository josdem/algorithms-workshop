package com.jos.dem.kata;

/*
You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.
 */

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class Sorter {

  private final Map<Integer, Integer> treeMap = new TreeMap<>();

  public int[] sort(int[] array) {
    IntStream.range(0, array.length)
        .filter(element -> array[element] % 2 != 0)
        .mapToObj(index -> array[index])
        .forEach(System.out::println);
    return array;
  }
}
