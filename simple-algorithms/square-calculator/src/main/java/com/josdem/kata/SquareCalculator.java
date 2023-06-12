package com.josdem.kata;

import java.util.List;
import java.util.stream.Collectors;

public class SquareCalculator {
  public List<Integer> square(List<Integer> numbers) {
    return numbers.stream().map(it -> it * it).collect(Collectors.toList());
  }
}
