package com.josdem.kata;

import java.util.Arrays;
import java.util.List;

public class LongestSubstring {
    public int reduce(String data) {
        List<String> substrings =
                Arrays.stream(data.split("")).distinct().toList();
        return !substrings.isEmpty() ? substrings.size() : 1;
    }
}
