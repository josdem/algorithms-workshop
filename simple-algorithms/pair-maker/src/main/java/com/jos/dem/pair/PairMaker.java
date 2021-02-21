package com.jos.dem.pair;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PairMaker {

    public List<Pair> make(List<Integer> numbers){
        return IntStream.range(0, numbers.size()-1)
                .mapToObj(i -> new Pair(numbers.get(i), numbers.get(i + 1)))
                .collect(Collectors.toList());
    }

}