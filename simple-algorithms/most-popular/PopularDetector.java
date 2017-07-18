import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class PopularDetector {

  private Integer find(List<Integer> numbers){
     Integer value = numbers.stream()
       .collect(Collectors.groupingBy(it -> it, Collectors.counting()))
       .entrySet()
       .stream()
       .max(Comparator.comparing(Map.Entry::getValue))
       .get()
       .getKey();
     return value;
  }


  public static void main(String[] args){
    List<Integer> numbers = Arrays.asList(34,31,34,56,12,35,24,34,69,18);
    Integer result = new PopularDetector().find(numbers);
    assert result == 34;
  }

}
