package com.jos.dem.kata;

/*
Given a string "aaabbbbcc"
When we call compress method
Then we have a compressed string like "a3b4c2"
 */

import java.util.Map;
import java.util.stream.Collectors;

public class StringCompressor {

  public String compress(String keyword) {
    Map<Object, Long> map =
        keyword
            .chars()
            .mapToObj(it -> (char) it)
            .collect(Collectors.groupingBy(it -> it, Collectors.counting()));
    StringBuilder sb = new StringBuilder();
    map.forEach(
        (k, v) -> {
          sb.append(k);
          sb.append(v);
        });
    return sb.toString();
  }
}
