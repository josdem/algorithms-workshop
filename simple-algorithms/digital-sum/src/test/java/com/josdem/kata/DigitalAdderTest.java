package com.josdem.kata;

/*
Given: A numeric collection
When: I call add method
Then: I will get a collection with every element summing its digits
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitalAdderTest {
  private DigitalAdder digitalAdder = new DigitalAdder();

  @Test
  @DisplayName("it sum every element in the collection")
  void shouldSumCollection() {
    List<Integer> numbers = Arrays.asList(15, 20, 4, 8);
    List<Integer> expectedCollection = Arrays.asList(6, 2, 4, 8);
    assertEquals(expectedCollection, digitalAdder.add(numbers));
  }
}
