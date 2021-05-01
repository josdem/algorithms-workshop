// Write a method that count characters in a string
// Given: "These are the characters!"
// Then: We expect to have 3a, 2c, zero z, etc

import java.util.Map;
import java.util.stream.Collectors;

public class CountingDuplicateCharacters {

  private Map<Character, Long> count(String string){
    return string.chars()
      .mapToObj(ch -> (char)ch)
      .collect(Collectors.groupingBy( ch -> ch, Collectors.counting()));
  }


  public static void main(String args[]){
    String string = "These are the characters!";
    Map<Character, Long> result = new CountingDuplicateCharacters().count(string);

    assert 3 == result.get('a');
    assert 2 == result.get('c');
    assert null == result.get('z');

  }
}
