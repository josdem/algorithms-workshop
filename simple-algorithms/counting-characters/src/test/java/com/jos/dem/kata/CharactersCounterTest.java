package com.jos.dem.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharactersCounterTest {

  private CharactersCounter charactersCounter = new CharactersCounter();

  @Test
  void shouldCountVowels() {
    assertEquals(2, charactersCounter.countVowels("josdem"));
  }

  @Test
  void shouldCountConsonants() {
    assertEquals(2, charactersCounter.countConsonants("josdem"));
  }
}
