package com.josdem.kata;

/*
 * Counting vowels and consonants. Create two functions one for counting vowels and another for counting consonants
 * Given: A string
 * When: That string is josdem
 * Then: Counting vowels should be 2 and consonants 4
 */

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
