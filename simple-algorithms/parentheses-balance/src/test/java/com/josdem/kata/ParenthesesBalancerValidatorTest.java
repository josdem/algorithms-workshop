package com.josdem.kata;

/**
 *  Given a string
 *  When I call isBalanced method
 *  Then Return a boolean indicating whether that string has balanced parentheses.
 */


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParenthesesBalancerValidatorTest {

    private ParenthesesBalancerValidator validator = new ParenthesesBalancerValidator();

    @Test
    @DisplayName("Validate is not null")
    void shouldNotBeNull() {
        assertFalse(validator.isBalanced(null), "should not be null");
    }

    @Test
    @DisplayName("Check string is balanced")
    void shouldbalanceSimpleString() {
        String value = "ab(c)(d())";
        assertTrue(validator.isBalanced(value), "string is balanced");
    }

    @Test
    @DisplayName("String is not balanced")
    void shouldCompressCombinationString() {
        String value = "((x()())";
        assertFalse(validator.isBalanced(value), "string is not balanced");
    }
}
