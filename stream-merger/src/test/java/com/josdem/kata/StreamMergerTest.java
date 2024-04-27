package com.josdem.kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        streamMerger.mergeInto(new CustomOutputStream());

        assertEquals(3, streamMerger.streams().size(), "should contain three streams");
        assertEquals(cst3, streamMerger.streams().toArray()[0], "should have cst3");
        assertEquals(cst2, streamMerger.streams().toArray()[1], "should have cst2");
        assertEquals(cst1, streamMerger.streams().toArray()[2], "should have cst1");
    }
}
