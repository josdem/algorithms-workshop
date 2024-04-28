package com.josdem.kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Given a stream merger class
 * And three custom stream objects with integer as id
 * When I call mergeInto function
 * Then I should get a collection with ordered ids from the streams
 */

class StreamMergerTest {

    @Test
    @DisplayName("getting an ordered stream collection")
    void shouldGetOrderedStreamCollection() {
        CustomInputStream cst1 = new CustomInputStream(2, "awesome!");
        CustomInputStream cst2 = new CustomInputStream(1, "is");
        CustomInputStream cst3 = new CustomInputStream(0, "This");

        Set<CustomInputStream> streams = new HashSet<>();
        streams.add(cst1);
        streams.add(cst2);
        streams.add(cst3);

        StreamMerger streamMerger = new StreamMerger(streams);
        Set<CustomInputStream> result = streamMerger.mergeInto(new CustomOutputStream());

        assertEquals(3, result.size(), "should contain three streams");
        assertEquals(cst3, result.toArray()[0], "should have cst3 value");
        assertEquals(cst2, result.toArray()[1], "should have cst2 value");
        assertEquals(cst1, result.toArray()[2], "should have cst1 value");
    }
}
