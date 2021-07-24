package com.jos.dem.kata;

/*
Anna and Brian order N items at a restaurant to share, but Anna declines to eat one of them due to an allergy.
When the check comes, they decide to split the cost of all the items; however, Brian may have forgotten that they did not split the some item and accidentally charged Anna for it.
Your task is to write a function which returns the amount of money that Brian needs to return to Anna.
prices = [3, 10, 2, 9], price item not shared = 10, money to return = 5
 */

import java.util.List;

public class BonAppetitCalculator {

  public int compute(List<Integer> prices) {
    return prices.size();
  }
}
