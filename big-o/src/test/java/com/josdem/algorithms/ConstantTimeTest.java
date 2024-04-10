package com.josdem.algorithms;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConstantTimeTest {

    private final ConstantTimePrinter constantTimePrinter = new ConstantTimePrinter();

    @Test
    @DisplayName("should print a number")
    void shouldPrintNumber(){
        assertEquals(1000, constantTimePrinter.print(1000));
    }
}
