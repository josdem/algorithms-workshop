package com.jos.dem.kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BiggestSmallerFinderTest {
  private SmallerBiggestFinder biggestSmallerFinder = new SmallerBiggestFinder();

  @Test
  @DisplayName("It finds smallest and biggest values")
  void shouldFindBiggestAndSmaller() {
    List<Integer> numbers = Arrays.asList(7, 5, 2, 4, 3, 9);
    assertEquals(Arrays.asList(2, 9), biggestSmallerFinder.find(numbers));
  }
}
