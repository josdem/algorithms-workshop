package com.jos.dem.kata;

/*
Given a numbers collection find fist non-repeated number in that collection
When we have: [25, 25, 18, 18, 18, 36, 1, 2, 2, 34] first non-repeated number is 36
 */

import java.util.ArrayList;
import java.util.List;

public class NonRepeatedFinder {

    public int find(List<Integer> numbers) {
        List<Integer> unique = new ArrayList<>();

        numbers.stream().forEach(n -> {
            if(numbers.stream().filter(it -> it == n).count() == 1) {
                unique.add(n);
            }
        });
        return unique.get(0);
    }
}
