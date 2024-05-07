package com.josdem.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class PhoneNumberGeneratorTest {

  private final PhoneNumberGenerator phoneNumberGenerator = new PhoneNumberGenerator();

  @Test
  @DisplayName("Format a phone number")
  void shouldFormatPhoneNumber() {
    assertEquals(
        "(123) 456-7890", phoneNumberGenerator.format(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
  }
}
