package com.josdem.algorithms;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTimeRunnerTest {

    private final SquareTimeRunner squareTimeRunner = new SquareTimeRunner();

    @Test
    @DisplayName("showing square time algorithm")
    void shouldTestSquareTime() {
        List<Integer> numbers = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> expectedNumbers = List.of(0, 5, 1, 4, 2, 3, 3, 2, 4, 1, 5, 0);
        int target = 5;
        assertEquals(expectedNumbers, squareTimeRunner.getTargetNumbers(numbers, target), "should get numbers from the array");
    }
}
