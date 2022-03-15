package com.jos.dem.challenge;

/*
Given A string with no spaces
And a source dictionary as words in an array
When I call to find method
Then I validate expected words are found
Note: Consider an empty string or null as inputs
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FastManFinderTest {

    private final FastManFinder fastmanFinder = new FastManFinder();

    @Test
    @DisplayName("It finds fast and man words")
    void shouldFindTwoWords() {
        assertEquals("fast man", fastmanFinder.find("fastman"));
    }

}
