package com.josdem.kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
Given two arrays with integers.
Then I want to return elements in common.
Input: [1,2,3,4,5] and [1,3,5,7,9]
Output: [1, 3 ,5]
*/
class CommonElementsTest {

  private final CommonElements commonElements = new CommonElements();

  @Test
  @DisplayName("find common elements")
  void shouldFindCommonElements() {
    assertEquals(
        Arrays.asList(1, 3, 5),
        commonElements.find(Arrays.asList(1, 2, 3, 4, 5), Arrays.asList(1, 3, 5, 7, 9)));
  }
}
