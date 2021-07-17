package com.jos.dem.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OddFinderTest {

  private OddFinder oddFinder = new OddFinder();

  @Test
  @DisplayName("Find the odd")
  void shouldFindTheOdd() {
    assertEquals(
        5, OddFinder.findIt(new int[] {20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
    assertEquals(-1, OddFinder.findIt(new int[] {1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}));
    assertEquals(5, OddFinder.findIt(new int[] {20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5}));
    assertEquals(10, OddFinder.findIt(new int[] {10}));
    assertEquals(10, OddFinder.findIt(new int[] {1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1}));
    assertEquals(1, OddFinder.findIt(new int[] {5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10}));
  }
}
