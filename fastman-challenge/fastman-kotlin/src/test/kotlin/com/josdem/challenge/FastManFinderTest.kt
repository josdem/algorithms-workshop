package com.josdem.challenge

/*
Given A string with no spaces
And a source dictionary as words in an array
When I call to find method
Then I validate expected words are found
 */

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FastManFinderTest {
    private val fastManFinder: FastManFinder = FastManFinder()

    @Test
    fun `it finds fast and man words`() {
        assertEquals("fast man", fastManFinder.find("fastman"));
    }
}