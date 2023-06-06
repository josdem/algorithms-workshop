package com.josdem.kata;

/*
Given an integer collection return a sum of its elements
 */

import java.util.List;

public class CollectionAdder {

    public int sum(List<Integer> numbers) {
        return numbers.stream().reduce(0, Integer::sum);
    }
}
