package com.josdem.algorithms;

import java.util.logging.Logger;

/*  Type: Constant Time Algorithms – O(1)
    Description: Fixed amount of time regardless of n value
 */
public class ConstantTimePrinter {
    private final Logger log = Logger.getLogger(ConstantTimePrinter.class.getName());
    public int print(int number) {
        log.info("Number: " + number);
        return number;
    }
}
