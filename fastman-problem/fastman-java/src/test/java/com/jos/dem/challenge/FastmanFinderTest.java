package com.jos.dem.challenge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FastmanFinderTest {

    private final FastmanFinder fastmanFinder = new FastmanFinder();

    @Test
    @DisplayName("It finds fast and man words")
    void shouldFindTwoWords() {
        assertEquals("fast man", fastmanFinder.find("fastman"));
    }

}
