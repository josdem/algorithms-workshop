package com.josdem.kata;

import java.util.ArrayList;
import java.util.List;

public class HeyYou {

    public List<String> find(List<Integer> numbers) {
        List<String> result = new ArrayList<>();
        numbers.forEach(n -> {
            if (n == 0) {
                result.add("you!");
            } else {
                result.add("Hey");
            }
        });
        return result;
    }
}
