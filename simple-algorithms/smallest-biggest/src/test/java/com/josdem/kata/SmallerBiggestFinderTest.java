package com.josdem.kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
Find smaller and biggest numbers in a collection
Given A collection like [7, 5, 2, 4, 3, 9]
When I call the find method
Then I will get a collection with [2, 9] values
 */

class SmallerBiggestFinderTest {
    private final SmallerBiggestFinder biggestSmallerFinder = new SmallerBiggestFinder();

    @Test
    @DisplayName("It finds smallest and biggest values")
    void shouldFindBiggestAndSmaller() {
        List<Integer> numbers = Arrays.asList(7, 5, 2, 4, 3, 9);
        assertEquals(Arrays.asList(2, 9), biggestSmallerFinder.find(numbers));
    }

    @Test
    @DisplayName("It reruns zeros")
    void shouldReturnZerosOnEmptyCollection() {
        assertEquals(Arrays.asList(0, 0), biggestSmallerFinder.find(new ArrayList<>()));
    }
}
