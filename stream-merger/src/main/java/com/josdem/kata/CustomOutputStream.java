package com.josdem.kata;

import java.util.logging.Logger;

public class CustomOutputStream {
    private final Logger log = Logger.getLogger(this.getClass().getName());

    void storeValue(int value) {
        log.info("value: " + value);
    }
}
