package com.jos.dem.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharactersCounterTest {

  private final String nickname = "josdem";
  private CharactersCounter charactersCounter = new CharactersCounter();

  @Test
  void shouldCountVowels() {
    assertEquals(2, charactersCounter.countVowels(nickname));
  }

  @Test
  void shouldCountConsonants() {
    assertEquals(4, charactersCounter.countConsonants(nickname));
  }
}
