package com.josdem.kata;

import java.util.ArrayList;
import java.util.List;

public class CustomOutputStream {
    private final List<Integer> list = new ArrayList<>();

    void storeValue(int value) {
        list.add(value);
    }

    public List<Integer> getList() {
        return list;
    }
}
