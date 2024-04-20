package com.josdem.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/*  Type: Array size plus compute logic Algorithm – O(a * p)
    Description: Collection size plus compute logic of getting largest prime number
 */

public class PrimeNumberRunner {

    private final Logger log = Logger.getLogger(this.getClass().getName());

    public List<Integer> getNumber(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        numbers.forEach(it -> {
            if (isPrime(it)) {
                log.info("prime:" + it);
                result.add(it);
            }
        });
        return result;
    }

    private boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
