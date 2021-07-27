package com.jos.dem.kata;

/*
Messages with random data are coming! But we just care about prices!
Your task is to implement a function which removes all non numeric data and return just the biggest price
messages = ["hi", "2", "@#$%", "32"]
result = 32
*/

import java.util.List;

public class BiggestNumberFinder {

  private String regex = "-?[0-9]+.?[0-9]+";

  public double find(List<String> numbers) {
    return numbers.stream()
        .filter(it -> it.matches(regex))
        .map(it -> Double.parseDouble(it))
        .max(Double::compare)
        .get();
  }
}
