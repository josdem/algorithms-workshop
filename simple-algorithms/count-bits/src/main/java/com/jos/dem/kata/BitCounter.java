package com.jos.dem.kata;

public class BitCounter {
  public int countBits(int number) {
    Long result =
        Integer.toBinaryString(number)
            .chars()
            .mapToObj(ch -> (char) ch)
            .filter(ch -> ch == '1')
            .count();
    return result.intValue();
  }
}
