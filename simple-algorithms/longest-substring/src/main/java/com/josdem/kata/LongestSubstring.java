package com.josdem.kata;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class LongestSubstring {
  public int compute(String data) {
    Set<Character> substrings = new HashSet<>();
    char[] chars = data.toCharArray();
    IntStream.range(0, data.toCharArray().length - 1)
        .forEach(
            index -> {
              substrings.add(chars[index]);
            });
    return substrings.size() > 0 ? substrings.size() : 1;
  }
}
