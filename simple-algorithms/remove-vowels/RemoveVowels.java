//Remove all of the vowels from a string
//When: String is: "This website does not work!"
//Then: Result should be: "Ths wbst ds nt wrk!"

import java.util.stream.Collectors;

public class RemoveVowels {

  private String remove(String keyword){
    return keyword.chars()
      .mapToObj(ch -> (char)ch)
      .filter(ch -> ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'&& ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U')
      .map(ch -> ch.toString())
      .collect(Collectors.joining());
  }

  public static void  main(String[] args){
    String keyword = "This website does not work!";
    String result = new RemoveVowels().remove(keyword);
    assert "Ths wbst ds nt wrk!".equals(result);
  }
}
