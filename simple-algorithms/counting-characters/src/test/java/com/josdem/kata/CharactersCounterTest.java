package com.josdem.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * Counting vowels and consonants. Create two functions one for counting vowels and another for counting consonants
 * Given: A string
 * When: That string is josdem
 * Then: Counting vowels should be 2 and consonants 4
 */
class CharactersCounterTest {
  private static final String NICKNAME = "josdem";
  private final CharactersCounter charactersCounter = new CharactersCounter();

  @Test
  void shouldCountVowels() {
    assertEquals(2, charactersCounter.countVowels(NICKNAME));
  }

  @Test
  void shouldCountConsonants() {
    assertEquals(4, charactersCounter.countConsonants(NICKNAME));
  }
}
