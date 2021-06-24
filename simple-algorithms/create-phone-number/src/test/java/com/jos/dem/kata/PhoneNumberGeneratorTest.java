package com.jos.dem.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PhoneNumberGeneratorTest {

  private PhoneNumberGenerator phoneNumberGenerator = new PhoneNumberGenerator();

  @Test
  @DisplayName("Format a phone number")
  void shouldFormatPhoneNumber() {
    assertEquals(
        "(123) 456-7890", phoneNumberGenerator.format(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
  }
}
