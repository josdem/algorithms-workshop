package com.jos.dem.kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class NumbersCounterTest {

    private NumbersCounter numbersCounter = new NumbersCounter();

    @Test
    @DisplayName("Counting numbers")
    void shouldCountNumbers() {
        assertArrayEquals(new int[]{3, 2, 1}, numbersCounter.count(new int[]{-4, 3, -9, 0, 4, 1}));
    }
}
