package com.josdem.kata;

/**
 * Given A string
 * When we call count uppercase method
 * Then I count how many characters are uppercase
 * And I validate it does not contain spaces
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingUppercaseTest {

  private UppercaseCounter uppercaseCounter = new UppercaseCounter();

  @Test
  @DisplayName("count three uppercase")
  void shouldCountThreeUppercase() {
    assertEquals(3, uppercaseCounter.count("JNfvHibuq"), "should count three uppercase");
  }

  @Test
  @DisplayName("count seven uppercase")
  void shouldCountSevenUppercase() {
    assertEquals(7, uppercaseCounter.count("SEKWdgPxTV"), "should count seven uppercase");
  }

  @Test
  @DisplayName("not contain space")
  void shouldValidateDoesNotContainSpace() {
    assertFalse(uppercaseCounter.hasSpace("SEKWdgPxTV"), "should validate does not contains space");
  }

  @Test
  @DisplayName("contains space")
  void shouldValidateContainSpace() {
    assertTrue(uppercaseCounter.hasSpace("Hello World!"), "should validate contains space");
  }
}
