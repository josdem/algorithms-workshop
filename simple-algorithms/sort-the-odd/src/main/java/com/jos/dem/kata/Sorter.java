package com.jos.dem.kata;

/*
You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.
 */

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.IntStream;

public class Sorter {

  public int[] sort(int[] array) {
    Iterator<Integer> odds = IntStream.of(array).filter(n -> n % 2 == 1).sorted().iterator();
    return Arrays.stream(array).map(n -> n % 2 == 0 ? n : odds.next()).toArray();
  }
}
