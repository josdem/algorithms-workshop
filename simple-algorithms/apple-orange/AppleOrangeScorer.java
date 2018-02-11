import java.util.List;
import java.util.ArrayList;

public class AppleOrangeScorer {

  private List<Integer> score(){
    return new ArrayList<Integer>();
  }

  public static void main(String[] args){
    List<Integer> resutl = new AppleOrangeScorer().score();
    assert 2 == result.size();
    assert 1 == result.get(0);
    assert 1 == result.get(1);
  }

}
