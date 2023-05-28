package com.josdem.kata;

/**
 * Given number of bullets and number of dragons
 * When I call fight method
 * Then return true if hero wins the fight
 * Note: Each dragon takes 2 bullets to be defeated
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HeroVsDragonsTest {

    private HeroVsDragons heroVsDragons = new HeroVsDragons();

    @Test
    @DisplayName("returns true when hero wins")
    void shouldReturnTrueWhenHeroWins(){
        assertTrue(heroVsDragons.fight(10, 5), "With 10 bullets and 5 dragons, hero should win");
        assertTrue(heroVsDragons.fight(100, 40), "With 100 bullets and 40 dragons, hero should win");
    }

    @Test
    @DisplayName("returns false when hero loses")
    void shouldReturnFalseWhenHeroLoses(){
        assertFalse(heroVsDragons.fight(1706635620, 1391914725 ), "With 1706635620 bullets and 1391914725 dragons, hero should lose");
    }
}
