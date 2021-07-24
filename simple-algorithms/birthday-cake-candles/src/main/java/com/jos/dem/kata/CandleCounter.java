package com.jos.dem.kata;

/*
It is your birthday! And you want to make it special, so you want to keep only biggest candles in the cake
Your task is to create a function that removes all small candles and just keep the biggest ones.
 */

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CandleCounter {

  public List<Integer> count(List<Integer> candles) {
    Optional<Integer> biggest = candles.stream().max(Integer::compare);
    return candles.stream().filter(it -> it == biggest.get()).collect(Collectors.toList());
  }
}
