import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class AppleOrangeScorer {

  private List<Integer> score(List<Integer> houseWidth){
    return new ArrayList<Integer>();
  }

  public static void main(String[] args){
    List<Integer> houseWidth = Arrays.asList(7, 11);
    List<Integer> result = new AppleOrangeScorer().score(houseWidth);
    assert 2 == result.size();
    assert 1 == result.get(0);
    assert 1 == result.get(1);
  }

}
