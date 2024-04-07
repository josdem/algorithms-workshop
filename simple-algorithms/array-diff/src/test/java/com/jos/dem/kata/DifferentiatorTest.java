package com.jos.dem.kata;

/*
Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
It should remove all values from list a, which are present in list b keeping their order.
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DifferentiatorTest {

    private final Differentiator differentiator = new Differentiator();

    @Test
    @DisplayName("Get difference")
    void shouldGetDifferenceInArrays() {
        assertEquals(List.of(2), differentiator.diff(List.of(1, 2), List.of(1)));
        assertEquals(List.of(2, 2), differentiator.diff(List.of(1, 2), List.of(1)));
        assertEquals(List.of(1), differentiator.diff(List.of(1, 2, 2), List.of(2)));
        assertEquals(List.of(1, 2, 2), differentiator.diff(List.of(1, 2, 2), new ArrayList<>()));
        assertEquals(new ArrayList<>(), differentiator.diff(new ArrayList<>(), List.of(1, 2)));
    }
}
