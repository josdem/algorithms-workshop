package com.jos.dem.pair;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PairMakerTest {

    private PairMaker pairMaker = new PairMaker();

    @Test
    @DisplayName("")
    void shouldMakePairs(){
        List<Integer> numbers = Arrays.asList(1,5,6,3,2,4,5,6);
        assertTrue(pairMaker.make(numbers) instanceof List);
    }

}