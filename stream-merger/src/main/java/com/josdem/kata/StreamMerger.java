package com.josdem.kata;

import java.util.Set;

public record StreamMerger(Set<CustomStream> streams) {

    public void mergeInto(CustomOutputStream stream) {
        stream.storeValue(0);
    }
}
