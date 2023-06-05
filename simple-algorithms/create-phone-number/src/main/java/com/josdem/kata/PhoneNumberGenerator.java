package com.josdem.kata;

import java.util.Arrays;

/*
Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.
 */

public class PhoneNumberGenerator {

  public String format(int[] array) {
    final StringBuilder sb = new StringBuilder();
    String arrayAsString =
        Arrays.stream(array).mapToObj(n -> String.valueOf(n)).reduce("", String::concat);
    sb.append(arrayAsString).insert(0, '(').insert(4, ')').insert(5, ' ').insert(9, '-');
    return sb.toString();
  }
}
