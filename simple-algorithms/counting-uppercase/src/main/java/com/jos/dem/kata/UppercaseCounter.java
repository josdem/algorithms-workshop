package com.jos.dem.kata;

public class UppercaseCounter {

  public int count(String message) {
    return (int) message.chars().filter(it -> it >= 65 && it <= 90).count();
  }
}
