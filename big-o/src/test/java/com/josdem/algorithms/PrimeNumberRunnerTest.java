package com.josdem.algorithms;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeNumberRunnerTest {

    private final PrimeNumberRunner primeNumberRunner = new PrimeNumberRunner();

    @Test
    @DisplayName("show array plus compute logic algorithm")
    void shouldReturnLargestPrimeNumber(){
        List<Integer> numbers = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> expectedNumbers = List.of(2, 3, 5, 7);
        assertEquals(expectedNumbers, primeNumberRunner.getNumber(numbers), "should get largest prime number in the array");
    }
}
