package com.josdem.kata;

public record CustomInputStream(int id, String value) implements Comparable<CustomInputStream> {
    @Override
    public int compareTo(CustomInputStream that) {
        return Integer.compare(this.id, that.id);
    }
}
