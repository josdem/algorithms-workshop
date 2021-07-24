package com.jos.dem.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BonAppetitCalculatorTest {

  private BonAppetitCalculator bonAppetitCalculator = new BonAppetitCalculator();

  @Test
  @DisplayName("Get money to return")
  void shouldGetMoneyToReturn() {
    assertEquals(5, bonAppetitCalculator.compute(Arrays.asList(3, 10, 2, 9)));
  }
}
