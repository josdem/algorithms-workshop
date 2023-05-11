package com.josdem.kata;

public class TwiceAsOld {
  public int compute(int dadYears, int sonYears) {
    return sonYears == 0 ? dadYears : Math.abs(dadYears - sonYears * 2);
  }
}
