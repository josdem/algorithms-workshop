package com.josdem.kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Given A string
 * When I call reduce method
 * Then I should have the length of a new string without repeated characters
 * <p>
 * Examples:
 * 1. abcabcbb -> abc = 3
 * 2. bbbbb -> b = 1
 * 3. ABDEFGABEF -> BDEFGA = 6
 */
class LongestSubstringTest {

    private final LongestSubstring longestSubstring = new LongestSubstring();

    @Test
    @DisplayName("finding longest substring from abcabcbb")
    void shouldFindLongestSubstringOne() {
        String data = "abcabcbb";
        assertEquals(3, longestSubstring.reduce(data), "Longest substring would be 3");
    }

    @Test
    @DisplayName("finding longest Substring from bbbbb")
    void shouldFindLongestSubstringTwo() {
        String data = "bbbbb";
        assertEquals(1, longestSubstring.reduce(data), "Longest substring would be 1");
    }

    @Test
    @DisplayName("find longest Substring for ABDEFGABEF")
    void shouldFindLongestSubstringThree() {
        String data = "ABDEFGABEF";
        assertEquals(6, longestSubstring.reduce(data), "Longest substring would be 6");
    }
}
