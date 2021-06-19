package com.jos.dem.kata;

/*
Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret question is still correct.
However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.
Your task is to write a function maskify, which changes all but the last four characters into '#'.
 */

public class Maskarator {

  public String maskify(String keyword) {
    if (keyword.length() < 5) {
      return keyword;
    }
    StringBuilder sb = new StringBuilder();
    keyword.substring(0, keyword.length() - 4).chars().forEach(ch -> sb.append("#"));
    sb.append(keyword.substring(keyword.length() - 4));
    return sb.toString();
  }
}
