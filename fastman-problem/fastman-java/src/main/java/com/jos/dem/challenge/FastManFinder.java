package com.jos.dem.challenge;

import java.util.stream.IntStream;

public class FastManFinder {

    private final String[] dictionary = new String[]{"fast", "fat", "man", "strong"};
    private final StringBuilder result = new StringBuilder();

    public String find(String string) {
        StringBuilder sb = new StringBuilder(string);
        IntStream.range(0, sb.length()).forEach(index -> {
            System.out.println(sb.substring(index));
            System.out.println("-----");
            reverseFind(string);
            System.out.println("-----");
        });
        return result.toString();
    }

    private void reverseFind(String string) {
        StringBuilder sb = new StringBuilder(string);
        IntStream.range(0, string.length()).map(it -> 0 - it + string.length() - 1).forEach(it -> System.out.println(sb.substring(it, string.length())));
    }
}
