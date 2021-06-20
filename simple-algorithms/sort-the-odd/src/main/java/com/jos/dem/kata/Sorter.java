package com.jos.dem.kata;

/*
You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.
 */

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sorter {

  public int[] sort(int[] array) {
    final Set<Integer> indexSet = new TreeSet<>();
    final Set<Integer> valueSet = new TreeSet<>();

    IntStream.range(0, array.length)
        .filter(element -> array[element] % 2 != 0)
        .mapToObj(index -> index)
        .forEach(
            index -> {
              indexSet.add(index);
              valueSet.add(array[index]);
            });

    List<Integer> indexes = indexSet.stream().collect(Collectors.toList());
    List<Integer> values = valueSet.stream().collect(Collectors.toList());
    IntStream.range(0, indexes.size()).forEach(i -> array[indexes.get(i)] = values.get(i));
    return array;
  }
}
