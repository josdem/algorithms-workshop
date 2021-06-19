package com.jos.dem.kata;

/*
Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
It should remove all values from list a, which are present in list b keeping their order.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Differentiator {

  public int[] diff(int[] a, int[] b) {
    List<Integer> basList = Arrays.stream(b).boxed().collect(Collectors.toList());
    return Arrays.stream(a).filter(number -> !basList.contains(number)).toArray();
  }
}
