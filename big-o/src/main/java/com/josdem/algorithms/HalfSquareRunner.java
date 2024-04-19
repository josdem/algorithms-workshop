package com.josdem.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/*  Type: Square Time Algorithms – O(n^2/2)
    Description: Half-square increment amount of time based on collection size
 */

public class HalfSquareRunner {
    private final Logger log = Logger.getLogger(this.getClass().getName());
    public List<Integer> getTargetNumbers(List<Integer> numbers, int target) {
        List<Integer> result = new ArrayList<>();
        for(int i=0; i < numbers.size(); i++){
            for(int j = i + 1; j < numbers.size(); j++){
                int a = numbers.get(i);
                int b = numbers.get(j);
                if (a + b == target){
                    result.add(a);
                    result.add(b);
                    log.info(a + "," + b);
                }
            }
        }
        return result;
    }
}
