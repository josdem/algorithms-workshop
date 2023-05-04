package com.jos.dem.kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
Given an integer collection, return an array with three elements:
how many of them are positive, how many negative and how many are zeros.
Given: [-4,3,-9,0,4,1] then expected output is: [3, 2, 1]
 */

class NumbersCounterTest {

    private final NumbersCounter numbersCounter = new NumbersCounter();

    @Test
    @DisplayName("Counting numbers")
    void shouldCountNumbers() {
        assertEquals(Arrays.asList(3, 2, 1), numbersCounter.count(Arrays.asList(-4, 3, -9, 0, 4, 1)));
    }
}
