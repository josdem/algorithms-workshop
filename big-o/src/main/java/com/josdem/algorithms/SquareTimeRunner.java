package com.josdem.algorithms;

import java.util.ArrayList;
import java.util.List;

public class SquareTimeRunner {

    public List<Integer> getTargetNumbers(List<Integer> numbers, int target) {
        List<Integer> result = new ArrayList<>();
        numbers.forEach(a -> {
            numbers.forEach(b -> {
                if (a + b == target) {
                    result.add(a);
                    result.add(b);
                }
            });
        });
        return  result;
    }
}
