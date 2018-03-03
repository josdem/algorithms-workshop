import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class SockPairMatcher{

  private Integer match(List<Integer> colors){
    return 0;
  }

  public static void main(String[] args){
    List<Integer> colors = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
    Integer result = new SockPairMatcher().match(colors);
    assert 3 == result;
  }

}
