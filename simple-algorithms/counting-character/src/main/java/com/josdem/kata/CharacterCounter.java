package com.josdem.kata;

public class CharacterCounter {
  public int count(String keyword, char ch) {
    return (int) keyword.chars().filter(it -> ch == (char) it).count();
  }
}
