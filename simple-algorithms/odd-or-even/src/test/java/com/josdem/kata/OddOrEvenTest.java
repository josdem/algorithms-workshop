package com.josdem.kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OddOrEvenTest {

    private OddOrEven oddOrEven = new OddOrEven();

    @Test
    @DisplayName("Evaluate is even length string")
    void shouldValidateIsEven(){
        assertTrue(oddOrEven.isEven("wolf"));
    }

    @Test
    @DisplayName("Evaluate is odd length string")
    void shouldValidateIsOdd(){
        assertFalse(oddOrEven.isEven("fox"));
    }
}
