package com.josdem.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation of that number.
You can guarantee that input is non-negative.
Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
 */

class BitCounterTest {
  private final BitCounter bitCounter = new BitCounter();

  @Test
  @DisplayName("Counting bits")
  void shouldCountBits() {
    assertEquals(5, bitCounter.countBits(1234));
    assertEquals(1, bitCounter.countBits(4));
    assertEquals(3, bitCounter.countBits(7));
    assertEquals(2, bitCounter.countBits(9));
    assertEquals(2, bitCounter.countBits(10));
  }
}
