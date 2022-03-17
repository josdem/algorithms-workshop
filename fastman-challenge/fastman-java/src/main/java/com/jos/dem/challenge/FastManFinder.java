package com.jos.dem.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FastManFinder {

    private final String[] dictionary = new String[]{"fast", "fat", "man", "strong"};
    private final List result = new ArrayList<String>();
    private String string = null;

    public String find(String string) {
        this.string = string;
        IntStream.range(0, string.length()).forEach(index -> {
            evaluateWord(0, index);
        });
        reverseFind();
        return String.join(" ", result);
    }

    private void reverseFind() {
        IntStream.range(0, string.length()).map(it -> 0 - it + string.length() - 1).forEach(index -> {
            evaluateWord(index, string.length());
        });
    }

    private void evaluateWord(int from, int to) {
        String word = string.substring(from, to);
        if (Arrays.asList(dictionary).contains(word)) {
            result.add(word);
        }
    }
}
