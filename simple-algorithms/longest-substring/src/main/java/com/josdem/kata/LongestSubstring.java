package com.josdem.kata;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongestSubstring {
    public int reduce(String data) {
        List<String> substrings =
                Arrays.stream(data.split("")).distinct().collect(Collectors.toList());
        return !substrings.isEmpty() ? substrings.size() : 1;
    }
}
