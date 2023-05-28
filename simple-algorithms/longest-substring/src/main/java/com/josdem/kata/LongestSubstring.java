package com.josdem.kata;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongestSubstring {
  public int reduce(String data) {
    List<String> substrings =
        Arrays.asList(data.split("")).stream().distinct().collect(Collectors.toList());
    return substrings.size() > 0 ? substrings.size() : 1;
  }
}
