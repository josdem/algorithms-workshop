package com.jos.dem.kata;

/*
You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Sorter {

  public int[] sort(int[] array) {
    int[] result = array.clone();
    final List<Integer> indexes = new ArrayList<>();
    final List<Integer> values = new ArrayList<>();

    IntStream.range(0, result.length)
        .filter(element -> result[element] % 2 != 0)
        .mapToObj(index -> index)
        .forEach(
            index -> {
              indexes.add(index);
              values.add(result[index]);
            });

    Collections.sort(indexes);
    Collections.sort(values);

    IntStream.range(0, indexes.size()).forEach(i -> result[indexes.get(i)] = values.get(i));
    return result;
  }
}
