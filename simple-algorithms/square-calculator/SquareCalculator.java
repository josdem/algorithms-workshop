import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SquareCalculator {

  private List<Integer> square(List<Integer> numbers){
    return numbers.stream()
      .map(i -> i * i)
      .collect(Collectors.toList());
  }

  public static void main(String[] args){
    List<Integer> numbers = Arrays.asList(1, 2, 3, 7, 9, 12, 15);
    List<Integer> result = new SquareCalculator().square(numbers);
    assert result.get(0) == 1;
    assert result.get(2) == 6;
    assert result.get(4) == 18;
    assert result.get(6) == 30;
  }

}
