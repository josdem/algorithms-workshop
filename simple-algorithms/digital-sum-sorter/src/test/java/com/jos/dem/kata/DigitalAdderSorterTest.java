package com.jos.dem.kata;

/*
Given: A numeric collection
When: I call add and sort method
Then: I will get a collection with every element summing its digits and sorted
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitalAdderSorterTest {
  private DigitalAdderSorter digitalAdderSorter = new DigitalAdderSorter();

  @Test
  @DisplayName("it sum every element in the collection and sort them")
  void shouldAddAndSort() {
    List<Integer> numbers = Arrays.asList(15, 20, 4, 8);
    List<Integer> expectedCollection = Arrays.asList(2, 4, 6, 8);
    assertEquals(expectedCollection, digitalAdderSorter.addAndSort(numbers));
  }
}
