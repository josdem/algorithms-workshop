import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class SockPairMatcher{

  private Integer match(List<Integer> colors){
    Map<Integer, Long> map = colors.stream()
      .collect(Collectors.groupingBy(it->it, Collectors.counting()));

    List<Long> values = map.entrySet().stream()
      .filter(it -> it.getValue() / 2 > 0)
      .map(Map.Entry::getValue)
      .collect(Collectors.toList());

    Long result = values.stream()
      .mapToLong(it -> it / 2)
      .sum();

    return result.intValue();
  }

  public static void main(String[] args){
    List<Integer> colors = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
    Integer result = new SockPairMatcher().match(colors);
    assert 3 == result;
  }

}
