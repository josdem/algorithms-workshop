package com.josdem.algorithms;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinearTimeRunnerTest {

    private final LinearTimeRunner linearTimeRunner = new LinearTimeRunner();

    @Test
    @DisplayName("showing linear time algorithm")
    void returnEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        assertEquals(Arrays.asList(2, 4, 6, 8, 0), linearTimeRunner.getEvenNumbers(numbers), "should get even numbers from the array");
    }
}
