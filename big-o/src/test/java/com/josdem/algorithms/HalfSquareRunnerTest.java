package com.josdem.algorithms;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HalfSquareRunnerTest {

    private final HalfSquareRunner halfSquareRunner = new HalfSquareRunner();

    @Test
    @DisplayName("show half-square algorithm")
    void shouldTestHalfSquare(){
        List<Integer> numbers = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> expectedNumbers = List.of(0, 5, 1, 4, 2, 3);
        int target = 5;
        assertEquals(expectedNumbers, halfSquareRunner.getTargetNumbers(numbers, target), "should get numbers from the array");
    }
}
