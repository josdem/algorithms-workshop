package com.jos.dem.kata;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PrimeTest {

  private PrimeEvaluator primeEvaluator = new PrimeEvaluator();

  @Test
  @DisplayName("Basic tests")
  void shouldMakeBasicTest() {
    assertFalse(primeEvaluator.isPrime(0), "0  is not prime");
    assertFalse(primeEvaluator.isPrime(1), "1  is not prime");
    assertTrue(primeEvaluator.isPrime(2), "2  is prime");
    assertTrue(primeEvaluator.isPrime(73), "73 is prime");
    assertFalse(primeEvaluator.isPrime(75), "75 is not prime");
    assertFalse(primeEvaluator.isPrime(-1), "-1 is not prime");
  }
}
