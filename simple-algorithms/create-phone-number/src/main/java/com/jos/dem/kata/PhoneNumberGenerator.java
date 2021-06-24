package com.jos.dem.kata;

import java.util.Arrays;

public class PhoneNumberGenerator {

  public String format(int[] array) {
    if (array.length != 10) {
      throw new IllegalArgumentException("Array length must be 10");
    }
    final StringBuilder sb = new StringBuilder();
    String arrayAsString =
        Arrays.stream(array).mapToObj(number -> String.valueOf(number)).reduce("", String::concat);
    sb.append(arrayAsString).insert(0, '(').insert(4, ')').insert(5, ' ').insert(9, '-');
    return sb.toString();
  }
}
