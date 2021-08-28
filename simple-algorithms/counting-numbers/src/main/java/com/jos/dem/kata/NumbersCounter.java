package com.jos.dem.kata;

/*
Given an integer collection, return an array with three elements:
how many of them are positive, how many negative and how many are zeros.
Given: [-4,3,-9,0,4,1] then expected output is: [3, 2, 1]
 */

import java.util.Arrays;

public class NumbersCounter {

    public int[] count(int[] numbers) {
        return new int[]{
                (int)Arrays.stream(numbers).filter(n -> n > 0).count(),
                (int)Arrays.stream(numbers).filter(n -> n < 0).count(),
                (int)Arrays.stream(numbers).filter(n -> n == 0).count()
        };
    }
}
