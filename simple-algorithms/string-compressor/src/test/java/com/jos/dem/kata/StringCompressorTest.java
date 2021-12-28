package com.jos.dem.kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCompressorTest {

    private StringCompressor stringCompressor = new StringCompressor();

    @DisplayName("compress a string")
    @Test
    void shouldCompressString(){
        String keyword = "aaabbbbcc";
        String expectedString = "a3b4c2";
        assertEquals(expectedString, stringCompressor.compress(keyword));
    }
}
