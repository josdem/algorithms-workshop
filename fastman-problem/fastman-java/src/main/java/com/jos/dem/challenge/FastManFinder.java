package com.jos.dem.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FastManFinder {

    private final String[] dictionary = new String[]{"fast", "fat", "man", "strong"};
    private final List result = new ArrayList<String>();

    public String find(String string) {
        IntStream.range(0, string.length()).forEach(index -> {
            String right = string.substring(0, index);
            if (Arrays.asList(dictionary).contains(right)) {
                result.add(right);
            }
        });
        reverseFind(string);
        return String.join(" ", result);
    }

    private void reverseFind(String string) {
        IntStream.range(0, string.length()).map(it -> 0 - it + string.length() - 1).forEach(index -> {
            String reverse = string.substring(index);
            if (Arrays.asList(dictionary).contains(reverse)) {
                result.add(reverse);
            }
        });
    }
}
