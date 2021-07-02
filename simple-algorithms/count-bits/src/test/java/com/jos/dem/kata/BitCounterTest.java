package com.jos.dem.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BitCounterTest {

  private BitCounter bitCounter = new BitCounter();

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
