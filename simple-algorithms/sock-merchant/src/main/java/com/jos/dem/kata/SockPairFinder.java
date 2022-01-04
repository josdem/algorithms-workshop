package com.jos.dem.kata;

/*
John works at a clothing store and he’s going through a pile of socks to find the number of matching pairs.
Given: A collection with socks’ colors 10, 20, 20, 10, 10, 30, 50, 10, 20
Then: Write a function to find out how many pairs you can get.
 */

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class SockPairFinder {

  public int findPairsBy(List<Integer> colors) {
    Map<Integer, Long> map =
        colors.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    List<Long> values =
        map.entrySet().stream()
            .map(Map.Entry::getValue)
            .filter(it -> it / 2 > 0)
            .collect(Collectors.toList());
    return colors.size();
  }
}
