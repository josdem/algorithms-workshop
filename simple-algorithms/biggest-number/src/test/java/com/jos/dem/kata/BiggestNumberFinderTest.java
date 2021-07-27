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
    assertEquals(32.0, biggestNumberFinder.find(Arrays.asList("hi", "2.0", "@#$%", "32.0")));
    assertEquals(-10.0, biggestNumberFinder.find(Arrays.asList("pair", "car", "-10.0")));
    assertEquals(3.14, biggestNumberFinder.find(Arrays.asList("main", "3.14", "yaml")));
  }
}
