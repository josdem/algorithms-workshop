package com.josdem.kata;

import java.util.HashSet;
import java.util.Set;

public record StreamMerger(Set<CustomInputStream> streams) {

    public Set<CustomInputStream> mergeInto(CustomOutputStream stream) {
        Set<CustomInputStream> resultSet = new HashSet<>(streams);
        resultSet.forEach(it -> stream.emitValue(it.getValue()));
        return resultSet;
    }
}
