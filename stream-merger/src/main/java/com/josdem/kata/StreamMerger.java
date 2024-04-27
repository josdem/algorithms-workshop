package com.josdem.kata;

import java.util.List;
import java.util.Set;

public record StreamMerger(Set<CustomStream> streams) {

    public List<Integer> mergeInto(CustomOutputStream stream) {
        streams.forEach(it -> stream.storeValue(it.getId()));
        return stream.getList();
    }
}
