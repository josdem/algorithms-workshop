package com.josdem.kata;

import java.util.List;
import java.util.stream.Collectors;

public class PhoneNumberGenerator {
    public String format(List<Integer> numbers) {
        StringBuilder sb = new StringBuilder();
        String numbersAsString = numbers.stream().map(String::valueOf).collect(Collectors.joining(""));
        sb.append(numbersAsString).insert(0, '(').insert(4, ')').insert(5, ' ').insert(9, '-');
        return sb.toString();
    }
}
