package com.josdem.algorithms;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestValueRunnerTest {

    private final LargestValueRunner largestValueRunner = new LargestValueRunner();

    @Test
    @DisplayName("show largest value algorithm")
    void shouldTestLargestValue(){
        List<Integer> numbers = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        int expectedNumber = 8;
        assertEquals(expectedNumber, largestValueRunner.getNumber(numbers), "should get largest even value");
    }
}
