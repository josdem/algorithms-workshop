import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BirthdayChocolateCalculator {

  private Integer compute(List<Integer> numbers, final Integer month, final Integer day) {

    List<List<Integer>> subSets =
      IntStream.range(1, 5)
      .mapToObj(it -> numbers.subList(it - 1, it + 1))
      .collect(Collectors.toList());

    for(List<Integer> set: subSets){
      set.forEach(System.out::println);
      System.out.println("-------");
    }

    System.out.println("---");


    return 0;
  }

  public static void main(String[] args){
    Integer month = 2;
    Integer day = 3;
    List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 2);
    Integer result = new BirthdayChocolateCalculator().compute(numbers, month, day);
    assert 2 == result;
  }

}
