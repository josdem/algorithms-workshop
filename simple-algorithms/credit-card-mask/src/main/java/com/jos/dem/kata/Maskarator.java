package com.jos.dem.kata;

public class Maskarator {

  private static final int SUFFIX_LENGTH = 4;

  public String maskify(String keyword) {
    return keyword.length() <= SUFFIX_LENGTH
    ? keyword
    : keyword.substring(0, keyword.length() - SUFFIX_LENGTH).replaceAll(".", "#")
        + keyword.substring(keyword.length() - SUFFIX_LENGTH);
  }
}
