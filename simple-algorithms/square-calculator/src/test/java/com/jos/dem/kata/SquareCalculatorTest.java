package com.jos.dem.kata;

/*
Given: A numeric list
When: I call square method
Then: I will get another list with every element squared.
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareCalculatorTest {

  private SquareCalculator squareCalculator = new SquareCalculator();

  @Test
  @DisplayName("it square my list")
  void shouldSquareList() {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 7, 9, 12, 15);
    assertEquals(Arrays.asList(1, 4, 9, 49, 81, 144, 225), squareCalculator.square(numbers));
  }
}
