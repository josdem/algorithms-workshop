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
    assertEquals(3, biggestNumberFinder.find(Arrays.asList("a1", "b2", "c3")));
  }
}
