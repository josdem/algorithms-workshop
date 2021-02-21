package com.jos.dem.pair;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PairMakerTest {

    private PairMaker pairMaker = new PairMaker();

    @Test
    @DisplayName("getting a list")
    void shouldExpectList() {
        List<Integer> numbers = Arrays.asList(1, 5, 6, 3, 2, 4, 5, 6);
        assertTrue(pairMaker.make(numbers) instanceof List);
    }

    @Test
    @DisplayName("getting expected pairs")
    void shouldMakePairs() {
        List<Integer> numbers = Arrays.asList(1, 5, 6, 3, 2, 4, 5, 6);
        assertEquals(expectedPairs(), pairMaker.make(numbers));
    }

    private List<Pair> expectedPairs() {
        return Arrays.asList(new Pair(1, 5), new Pair(5, 6), new Pair(2, 4), new Pair(4, 5), new Pair(5, 6));
    }

}