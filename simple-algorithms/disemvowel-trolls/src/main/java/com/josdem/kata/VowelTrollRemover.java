package com.josdem.kata;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Trolls are attacking your comment section!
A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
Your task is to write a function that takes a string and return a new string with all vowels removed.
For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
Note: for this kata y isn't considered a vowel.
 */

public class VowelTrollRemover {

  public String remove(String keyword) {
    List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

    return keyword
        .chars()
        .mapToObj(ch -> (char) ch)
        .filter(ch -> !vowels.contains(ch))
        .map(ch -> ch.toString())
        .collect(Collectors.joining());
  }
}
