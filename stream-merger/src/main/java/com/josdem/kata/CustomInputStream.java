package com.josdem.kata;

public class CustomInputStream {
    private final int id;
    private final String value;

    public CustomInputStream(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }
}
