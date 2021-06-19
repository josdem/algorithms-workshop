package com.jos.dem.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DifferentiatorTest {

  private Differentiator differentiator = new Differentiator();

  @Test
  @DisplayName("Get difference")
  void shouldGetDifferenceInArrays() {
    assertEquals(new int[] {2}, differentiator.diff(new int[] {1, 2}, new int[] {1}));
    assertEquals(new int[] {2, 2}, differentiator.diff(new int[] {1, 2, 2}, new int[] {1}));
    assertEquals(new int[] {1}, differentiator.diff(new int[] {1, 2, 2}, new int[] {2}));
    assertEquals(new int[] {1, 2, 2}, differentiator.diff(new int[] {1, 2, 2}, new int[] {}));
    assertEquals(new int[] {}, differentiator.diff(new int[] {}, new int[] {1, 2}));
  }
}
