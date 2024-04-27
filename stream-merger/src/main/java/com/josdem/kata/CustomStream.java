package com.josdem.kata;

public class CustomStream implements Comparable<CustomStream>{
    private final int id;
    public CustomStream(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(CustomStream that) {
        return Integer.compare(this.id, that.id);
    }
}
