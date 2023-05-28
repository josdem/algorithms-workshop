package com.jos.dem.kata;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Differentiator {

    public int[] diff(int[] a, int[] b) {
        List<Integer> basList = Arrays.stream(b).boxed().collect(Collectors.toList());
        return Arrays.stream(a).filter(number -> !basList.contains(number)).toArray();
    }
}
