package com.jos.dem.kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PopularFinderTest {

    private PopularFinder popularFinder = new PopularFinder();

    @Test
    @DisplayName("find most popular")
    void shouldFindMostPopular() {
        assertEquals(34, popularFinder.find(Arrays.asList(34, 31, 34, 56, 12, 35, 24, 34, 69, 18)));
    }
}
