import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class AppleOrangeScorer {

  private Pair score(
      Pair houseWidth,
      Pair treeDistance,
      List<Integer>larryThrows,
      List<Integer>robThrows){

    Pair result = new Pair();
    Integer larryScore = 0;
    Integer robScore = 0;

    for(Integer lthrow: larryThrows){
      if(treeDistance.getFirst() + lthrow >= houseWidth.getFirst() &&
         treeDistance.getFirst() + lthrow <= houseWidth.getLast()){
        larryScore++;
      }
    }

    //if(larryThrows.stream().allMatch(x -> x)) {}

    for(Integer rthrow: robThrows){
      if(treeDistance.getLast() + rthrow >= houseWidth.getFirst() &&
         treeDistance.getLast() + rthrow <= houseWidth.getLast()){
        robScore++;
      }
    }

    result.setFirst(larryScore);
    result.setLast(robScore);

    return result;
  }

  public static void main(String[] args){
    Pair houseWidth = new Pair(7, 11);
    Pair treeDistance = new Pair(5, 15);

    List<Integer> larryThrows = Arrays.asList(-2, 2, 1);
    List<Integer> robThrows = Arrays.asList(5, -6);

    Pair result = new AppleOrangeScorer().score(houseWidth, treeDistance, larryThrows, robThrows);

    assert 1 == result.getFirst();
    assert 1 == result.getLast();
  }

}

class Pair {
  private Integer first;
  private Integer last;

  public Pair(){}

  public Pair(Integer first, Integer last){
    this.first = first;
    this.last = last;
  }

  public void setFirst(Integer first){
    this.first = first;
  }

  public void setLast(Integer last){
    this.last = last;
  }

  public Integer getFirst(){
    return first;
  }

  public Integer getLast(){
    return last;
  }
}
