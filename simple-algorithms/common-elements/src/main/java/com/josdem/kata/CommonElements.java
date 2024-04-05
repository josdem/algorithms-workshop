package com.josdem.kata;

import java.util.List;
import java.util.stream.Collectors;

public class CommonElements {

  public List<Integer> find(List<Integer> first, List<Integer> second) {
    return first.stream().filter(second::contains).collect(Collectors.toList());
  }
}
