package com.jos.dem.kata;

/*
Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret question is still correct.
However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.
Your task is to write a function maskify, which changes all but the last four characters into '#'.
 */

public class Maskarator {

  private static final int SUFFIX_LENGTH = 4;

  public String maskify(String keyword) {
    return keyword.length() <= SUFFIX_LENGTH
        ? keyword
        : keyword.substring(0, keyword.length() - SUFFIX_LENGTH).replaceAll(".", "#")
            + keyword.substring(keyword.length() - SUFFIX_LENGTH);
  }
}
