package com.josdem.kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
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
        CustomStream cst1 = new CustomStream(2);
        CustomStream cst2 = new CustomStream(1);
        CustomStream cst3 = new CustomStream(0);

        Set<CustomStream> streams = new HashSet<>();
        streams.add(cst1);
        streams.add(cst2);
        streams.add(cst3);

        StreamMerger streamMerger = new StreamMerger(streams);
        List<Integer> result = streamMerger.mergeInto(new CustomOutputStream());

        assertEquals(3, result.size(), "should contain three streams");
        assertEquals(0, result.get(0), "should have cst3 value");
        assertEquals(1, result.get(1), "should have cst2 value");
        assertEquals(2, result.get(2), "should have cst1 value");
    }
}
