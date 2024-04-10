package com.josdem.kata;

import java.util.Arrays;
import java.util.List;

public class CharactersCounter {
  private List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
  private List<Character> consonants =
      Arrays.asList(
          'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'r', 'p', 'q', 's', 't', 'v', 'w',
          'x', 'y', 'z');

  public int countVowels(String keyword) {
    return (int) keyword.chars().filter(ch -> vowels.contains((char) ch)).count();
  }

  public int countConsonants(String keyword) {
    return (int) keyword.chars().filter(ch -> consonants.contains((char) ch)).count();
  }
}
