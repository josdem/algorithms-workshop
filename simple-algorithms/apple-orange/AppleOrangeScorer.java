import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class AppleOrangeScorer {

  private List<Integer> score(
      List<Integer> houseWidth,
      List<Integer> treeDistances,
      List<Integer>larryThrows,
      List<Integer>robThrows){

    List<Integer> result = new ArrayList<Integer>();
    Integer larryScore = 0;
    Integer robScore = 0;

    for(Integer lthrow: larryThrows){
      if(treeDistances.get(0) + lthrow >= houseWidth.get(0) && treeDistances.get(0) + lthrow <= houseWidth.get(1)){
        larryScore++;
      }
    }

    for(Integer rthrow: robThrows){
      if(treeDistances.get(1) + rthrow >= houseWidth.get(0) && treeDistances.get(1) + rthrow <= houseWidth.get(1)){
        robScore++;
      }
    }

    result.add(larryScore);
    result.add(robScore);

    return result;
  }

  public static void main(String[] args){
    List<Integer> houseWidth = Arrays.asList(7, 11);
    List<Integer> treeDistances = Arrays.asList(5, 15);
    List<Integer> larryThrows = Arrays.asList(-2, 2, 1);
    List<Integer> robThrows = Arrays.asList(5, -6);

    List<Integer> result = new AppleOrangeScorer().score(houseWidth, treeDistances, larryThrows, robThrows);
    System.out.println(result);

    assert 2 == result.size();
    assert 1 == result.get(0);
    assert 1 == result.get(1);
  }

}
