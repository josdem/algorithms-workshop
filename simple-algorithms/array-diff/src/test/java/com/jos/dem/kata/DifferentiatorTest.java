package com.jos.dem.kata;

/*
Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
It should remove all values from list a, which are present in list b keeping their order.
 */

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DifferentiatorTest {

  private Differentiator differentiator = new Differentiator();

  @Test
  @DisplayName("Get difference")
  void shouldGetDifferenceInArrays() {
    assertArrayEquals(new int[] {2}, differentiator.diff(new int[] {1, 2}, new int[] {1}));
    assertArrayEquals(new int[] {2, 2}, differentiator.diff(new int[] {1, 2, 2}, new int[] {1}));
    assertArrayEquals(new int[] {1}, differentiator.diff(new int[] {1, 2, 2}, new int[] {2}));
    assertArrayEquals(new int[] {1, 2, 2}, differentiator.diff(new int[] {1, 2, 2}, new int[] {}));
    assertArrayEquals(new int[] {}, differentiator.diff(new int[] {}, new int[] {1, 2}));
  }
}
