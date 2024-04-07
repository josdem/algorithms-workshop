package com.jos.dem.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
Messages with random data are coming! But we just care about prices!
Your task is to implement a function which removes all non-numeric data and return just the biggest price
messages = ["hi", "2", "@#$%", "32"]
result = 32
*/

class BiggestNumberFinderTest {

  private final BiggestNumberFinder biggestNumberFinder = new BiggestNumberFinder();

  @Test
  @DisplayName("Find biggest")
  void shouldFindBiggestNumber() {
    assertEquals(32.0, biggestNumberFinder.find(Arrays.asList("hi", "2.0", "@#$%", "32.0")));
    assertEquals(-10.0, biggestNumberFinder.find(Arrays.asList("pair", "car", "-10.0")));
    assertEquals(3.14, biggestNumberFinder.find(Arrays.asList("main", "3.14", "yaml")));
  }
}
