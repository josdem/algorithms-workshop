package com.jos.dem.kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NonRepeatedFinderTest {

    private NonRepeatedFinder nonRepeatedFinder = new NonRepeatedFinder();

    @Test
    @DisplayName("Find fist non repeated")
    void shouldFindFirstNonRepeated(){
        assertEquals(36, nonRepeatedFinder.find(Arrays.asList(25, 25, 18, 18, 18, 36, 1, 2, 2, 34)));
    }
}
