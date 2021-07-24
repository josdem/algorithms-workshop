import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class BiggestNumber {

  private OptionalInt find(List<String> strings) {
    return strings.stream().map(s -> s.substring(1)).mapToInt(Integer::parseInt).max();
  }

  public static void main(String[] args) {
    List<String> strings = Arrays.asList("a1", "b2", "c3");
    OptionalInt result = new BiggestNumber().find(strings);
    assert result.getAsInt() == 3;
  }
}
