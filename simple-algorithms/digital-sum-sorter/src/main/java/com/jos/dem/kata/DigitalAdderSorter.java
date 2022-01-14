package com.jos.dem.kata;

import java.util.List;
import java.util.stream.Collectors;

public class DigitalAdderSorter {
  public List<Integer> addAndSort(List<Integer> numbers) {
    List<String> numbersAsString =
        numbers.stream().map(it -> String.valueOf(it)).collect(Collectors.toList());
    return numbersAsString.stream()
        .map(string -> string.chars().map(ch -> Integer.valueOf(Character.toString(ch))).sum())
        .collect(Collectors.toList());
  }
}
