package com.josdem.kata;

import java.util.List;

public class Differentiator {

    public List<Integer> diff(List<Integer> a, List<Integer> b) {
        return a.stream().filter(number -> !b.contains(number)).toList();
    }
}
