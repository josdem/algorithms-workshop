package com.josdem.kata;

public class UppercaseCounter {

  public int count(String message) {
    return (int) message.chars().filter(it -> it >= 65 && it <= 90).count();
  }

  public boolean hasSpace(String message) {
    return message.contains(" ");
  }
}
