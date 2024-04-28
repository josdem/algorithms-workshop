package com.josdem.kata;

import java.util.Set;
import java.util.TreeSet;

public record StreamMerger(Set<CustomInputStream> streams) {

    public Set<CustomInputStream> mergeInto(CustomOutputStream stream) {
        TreeSet<CustomInputStream> treeSet = new TreeSet<>(streams);
        treeSet.forEach(item -> stream.storeValue(item.id()));
        return treeSet;
    }

}
