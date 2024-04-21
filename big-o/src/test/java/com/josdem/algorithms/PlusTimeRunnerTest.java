package com.josdem.algorithms;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlusTimeRunnerTest {

    private final PlusTimeRunner plusTimeRunner = new PlusTimeRunner();

    @Test
    @DisplayName("show plus time algorithm")
    void shouldCreateCollectionWithFixedSize(){
        List<Integer> numbers = List.of(3, 9, 15, 2, 11, 1, 18, 6, 4, 10);
        int expectedSize = 16;
        assertEquals(expectedSize, plusTimeRunner.getList().size(), "should have expected size");
    }
}
