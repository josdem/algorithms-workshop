package com.jos.dem.kata;

/*
Given two arrays with integers.
Then I want to return elements in common.
Input: [1,2,3,4,5] and [1,3,5,7,9]
Output: [1, 3 ,5]
*/

import java.util.List;
import java.util.stream.Collectors;

public class CommonElements {

  public List<Integer> find(List<Integer> first, List<Integer> second) {
    return first.stream().filter(it -> second.contains(it)).collect(Collectors.toList());
  }
}
