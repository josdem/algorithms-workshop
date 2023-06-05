package com.josdem.kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SockPairFinderTest {

    private SockPairFinder sockPairFinder = new SockPairFinder();

    @Test
    @DisplayName("Find sock pairs")
    void shouldFindPairs(){
        List<Integer> colors = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
        assertEquals(3, sockPairFinder.findPairsBy(colors));
    }
}
