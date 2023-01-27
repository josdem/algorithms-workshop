package com.josdem.kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Given: A list of integer numbers
 * When: I iterate over the list
 * Then: If I find a zero I will change it for "you!" if is not zero I will change it for "Hey"
 */

class HeyYouTest {

    private HeyYou converter = new HeyYou();

    @Test
    @DisplayName("not having any zero")
    void shouldNotFindAnyZero(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        assertEquals(Arrays.asList("Hey", "Hey", "Hey", "Hey", "Hey", "Hey", "Hey", "Hey" ,"Hey"), converter.find(numbers));
    }

    @Test
    @DisplayName("having a zeros")
    void shouldFindAZero(){
        List<Integer> numbers = Arrays.asList(1,0,3,0,5,0);
        assertEquals(Arrays.asList("Hey", "you!", "Hey", "you!", "Hey", "you!"), converter.find(numbers));
    }

    @Test
    @DisplayName("having a reverse hello")
    void shouldFindReverseHello(){
        List<Integer> numbers = Arrays.asList(0,1);
        assertEquals(Arrays.asList("you!", "Hey"), converter.find(numbers));
    }
}
