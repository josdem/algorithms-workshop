package com.jos.dem.kata;

import java.util.List;

public class PhoneNumberGenerator {
    public String format(List<Integer> numbers) {
        final StringBuilder sb = new StringBuilder();
        String arrayAsString =
                numbers.stream().map(String::valueOf).reduce("", String::concat);
        sb.append(arrayAsString).insert(0, '(').insert(4, ')').insert(5, ' ').insert(9, '-');
        return sb.toString();
    }
}
