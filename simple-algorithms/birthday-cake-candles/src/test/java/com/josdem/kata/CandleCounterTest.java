package com.josdem.kata;

/*
It is your birthday! And you want to make it special, so you want to keep only biggest candles in the cake
Your task is to create a function that removes all small candles and just keep the biggest ones.
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CandleCounterTest {

    private final CandleCounter candleCounter = new CandleCounter();

    @Test
    @DisplayName("Keep biggest candles")
    void shouldKeepBiggestCandles() {
        assertEquals(List.of(3, 3), candleCounter.count(List.of(3, 2, 1, 3)));
        assertEquals(List.of(1), candleCounter.count(List.of(1)));
    }
}
