package com.jos.dem.kata;

/**
 * Given A string When we call count uppercase method Then I count how many characters are uppercase
 */
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountingUppercaseTest {

  private UppercaseCounter uppercaseCounter = new UppercaseCounter();

  @Test
  @DisplayName("count seven uppercase")
  void shouldCountSevenUppercase() {
    assertEquals(7, uppercaseCounter.count("SEKWdgPxTV"), "should count seven uppercase");
  }
}
