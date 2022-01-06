package com.jos.dem.kata;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ShopCalculator {

  public int compute(Integer amount, List<Integer> keyboards, List<Integer> usbs) {
    final List<Map.Entry<Integer, Integer>> pairs = new ArrayList<>();

    keyboards.forEach(
        k ->
            usbs.forEach(
                u -> {
                  pairs.add(new SimpleEntry<>(k, u));
                }));

    final List<Integer> prices =
        pairs.stream().map(entry -> entry.getKey() + entry.getValue()).collect(Collectors.toList());
    return amount + keyboards.size() + usbs.size();
  }
}
