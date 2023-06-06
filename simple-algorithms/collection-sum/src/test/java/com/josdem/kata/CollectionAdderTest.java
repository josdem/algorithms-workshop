package com.josdem.kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CollectionAdderTest {

    private CollectionAdder collectionAdder = new CollectionAdder();

    @Test
    @DisplayName("Accumulating a collection")
    void shouldSumCollection() {
        assertEquals(31, collectionAdder.sum(Arrays.asList(1, 2, 3, 4, 10, 11)));
        assertEquals(21, collectionAdder.sum(Arrays.asList(5, 4, 1, 2, 9)));
    }

}
