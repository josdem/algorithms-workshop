package com.jos.dem.kata;

public class CharacterCounter {
  public int count(String keyword, char ch) {
    return (int) keyword.chars().filter(it -> ch == (char) it).count();
  }
}
