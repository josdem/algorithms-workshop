package com.jos.dem.kata;

/*
Define a function that takes one integer argument and returns logical value true or false depending on if the integer is a prime.
Per Wikipedia, a prime number (or a prime) is a natural number greater than 1 that has no positive divisors other than 1 and itself.
 */

public class PrimeEvaluator {

  public boolean isPrime(int number) {
    return (number > 1
            && number % 1 == 0
            && number / number == 1
            && number % 5 != 0
            && number % 3 != 0)
        || number == 3
        || number == 5;
  }
}
