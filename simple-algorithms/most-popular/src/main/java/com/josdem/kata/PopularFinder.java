package com.josdem.kata;

/*
Given a collection with numbers: [34 , 31, 34, 56, 12, 35, 24, 34, 69, 18]
Write a function that finds most popular number in the array, in this case 34 because it is the number that appears most often.
 */

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PopularFinder {

  public int find(List<Integer> numbers) {
    return numbers.stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .entrySet()
        .stream()
        .max(Comparator.comparing(Map.Entry::getValue))
        .get()
        .getKey();
  }
}
