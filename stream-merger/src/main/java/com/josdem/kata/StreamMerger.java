package com.josdem.kata;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public record StreamMerger(Set<CustomStream> streams) {

    public Set<CustomStream> mergeInto(CustomOutputStream stream) {
        TreeSet<CustomStream> treeSet = new TreeSet<>(streams);
        treeSet.forEach(item -> stream.storeValue(item.getId()));
        return treeSet;
    }
}
