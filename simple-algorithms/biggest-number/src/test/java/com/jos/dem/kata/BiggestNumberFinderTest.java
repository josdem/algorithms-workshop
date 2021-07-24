package com.jos.dem.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BiggestNumberFinderTest {

  private BiggestNumberFinder biggestNumberFinder = new BiggestNumberFinder();

  @Test
  @DisplayName("Find biggest")
  void shouldFindBiggestNumber() {
    assertEquals(32, biggestNumberFinder.find(Arrays.asList("hi", "2", "@#$%", "32")));
    assertEquals(-10, biggestNumberFinder.find(Arrays.asList("pair", "car", "-10")));
    assertEquals(3.1416, biggestNumberFinder.find(Arrays.asList("main", "3.1416", "yaml")));
  }
}
