package com.jos.dem.kata;

/*
Given a numbers collection find fist non-repeated number in that collection
When we have: [25, 25, 18, 18, 18, 36, 1, 2, 2, 34] first non-repeated number is 36
 */

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedFinder {

    public int find(List<Integer> numbers) {
        Map<Integer, Long> map = numbers.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        return map.entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst().get().getKey();
    }
}
