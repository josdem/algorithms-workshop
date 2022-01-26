package com.jos.dem.kata;

/*
Given: A string named keyword
When: We call count character method
Then: I count how many times this character appears in the keyword
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharacterCounterTest {

  private CharacterCounter characterCounter = new CharacterCounter();

  @Test
  @DisplayName("it counts m character")
  void shouldCountLastCharacter() {
    String keyword = "josdem";
    assertEquals(1, characterCounter.count(keyword, 'm'));
  }

  @Test
  @DisplayName("it counts three times target character")
  void shouldCountThreeCharacters() {
    String keyword = "Alabama";
    assertEquals(3, characterCounter.count(keyword, 'a'));
  }
}
