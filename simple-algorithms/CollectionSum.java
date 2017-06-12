import java.util.List;
import java.util.stream.IntStream;
import java.util.ArrayList;

public class CollectionSum {

  private Integer sum(List<Integer> array){
    return array.stream().mapToInt(Number::intValue).sum();
  }

  public static void main(String[] args){
    List<Integer> array = new ArrayList<Integer>();
    array.add(1);
    array.add(2);
    array.add(3);
    array.add(4);
    array.add(10);
    array.add(11);
    Integer result = new CollectionSum().sum(array);
    System.out.println(result);
  }

}
