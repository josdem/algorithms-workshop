package com.josdem.kata;

/**
 * Given number of bullets and number of dragons
 * When I call fight method
 * Then return true if hero wins the fight
 * Note: Each dragon takes 2 bullets to be defeated
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class HeroVsDragonsTest {

    private HeroVsDragons heroVsDragons = new HeroVsDragons();

    @Test
    @DisplayName("returns true when hero wins")
    void shouldReturnTrueWhenHeroWins(){
        assertTrue(heroVsDragons.fight(10, 5), "With 10 bullets and 5 dragons, hero should win");
        assertTrue(heroVsDragons.fight(100, 40), "With 100 bullets and 40 dragons, hero should win");
    }
}
