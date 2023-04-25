package com.josdem.kata;

import java.util.List;

public class ShopCalculator {

    public int compute(Integer amount, List<Integer> keyboards, List<Integer> usbs) {
        return amount + keyboards.size() + usbs.size();
    }
}
