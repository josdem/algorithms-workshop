package com.josdem.kata;

/*
It is your birthday! And you want to make it special, so you want to keep only biggest candles in the cake
Your task is to create a function that removes all small candles and just keep the biggest ones.
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CandleCounterTest {

    private CandleCounter candleCounter = new CandleCounter();

    @Test
    @DisplayName("Keep biggest candles")
    void shouldKeepBiggestCandles() {
        assertEquals(Arrays.asList(3, 3), candleCounter.count(Arrays.asList(3, 2, 1, 3)));
        assertEquals(Arrays.asList(1), candleCounter.count(Arrays.asList(1)));
    }
}
