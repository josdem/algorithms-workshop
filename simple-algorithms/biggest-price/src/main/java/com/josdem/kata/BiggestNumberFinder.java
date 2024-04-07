package com.josdem.kata;

import java.util.List;
import java.util.Optional;

public class BiggestNumberFinder {
    private static final String REGEX = "-?[0-9]+.?[0-9]+";
    public double find(List<String> numbers) {
        Optional<Double> result = numbers.stream().filter(it -> it.matches(REGEX)).map(Double::parseDouble).max(Double::compare);
        return result.orElseThrow(RuntimeException::new);
    }
}
