package com.josdem.kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Given A string
 * When I call compute method
 * Then I should have the longest substring or subset within the string
 * Note: if input is "abcabcbb"s then the longest substring is abc and the length of that would be 3
 */

class LongestSubstringTest {

  private final LongestSubstring longestSubstring = new LongestSubstring();

  @Test
  @DisplayName("finding longest substring from abcabcbb")
  void shouldFindLongestSubstringOne() {
    String data = "abcabcbb";
    assertEquals(3, longestSubstring.compute(data), "Longest SubString would be 3");
  }

  @Test
  @DisplayName("finding longest Substring from bbbbb")
  void shouldFindLongestSubstringTwo() {
    String data = "bbbbb";
    assertEquals(1, longestSubstring.compute(data), "Longest SubString would be 1");
  }

  @Test
  @DisplayName("find longest Substring for ABDEFGABEF")
  void shouldFindLongestSubstringThree() {
    String data = "ABDEFGABEF";
    assertEquals(6, longestSubstring.compute(data), "Longest SubString would be 6");
  }
}
