package com.josdem.kata;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CandleCounter {

    public List<Integer> count(List<Integer> candles) {
        Optional<Integer> biggest = candles.stream().max(Integer::compare);
        return candles.stream().filter(it -> Objects.equals(it, biggest.get())).toList();
    }
}
