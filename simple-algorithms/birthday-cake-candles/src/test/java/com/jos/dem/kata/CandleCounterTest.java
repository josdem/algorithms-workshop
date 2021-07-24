package com.jos.dem.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CandleCounterTest {

  private CandleCounter candleCounter = new CandleCounter();

  @Test
  @DisplayName("Keep biggest candles")
  void shouldKeepBiggestCandles() {
    assertEquals(Arrays.asList(3, 3), candleCounter.count(Arrays.asList(3, 2, 1, 3)));
    assertEquals(Arrays.asList(1), candleCounter.count(Arrays.asList(1)));
  }
}
