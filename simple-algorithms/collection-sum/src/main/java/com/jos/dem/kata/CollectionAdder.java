package com.jos.dem.kata;

import java.util.List;

public class CollectionAdder {

    public int sum(List<Integer> numbers) {
        return numbers.stream().reduce(0, Integer::sum);
    }
}
