package com.josdem.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/*  Type: Square Time Algorithms – O(n^2)
    Description: Square increment amount of time based on collection size
 */

public class SquareTimeRunner {

    private final Logger log = Logger.getLogger(this.getClass().getName());

    public List<Integer> getTargetNumbers(List<Integer> numbers, int target) {
        List<Integer> result = new ArrayList<>();
        numbers.forEach(a -> {
            numbers.forEach(b -> {
                if (a + b == target) {
                    result.add(a);
                    result.add(b);
                    log.info(a + "," + b);
                }
            });
        });
        return  result;
    }
}
