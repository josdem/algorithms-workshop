package com.jos.dem.kata;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CandleCounter {

    public List<Integer> count(List<Integer> candles) {
        Optional<Integer> biggest = candles.stream().max(Integer::compare);
        return candles.stream().filter(it -> it == biggest.get()).collect(Collectors.toList());
    }
}
