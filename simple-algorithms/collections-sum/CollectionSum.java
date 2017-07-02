import java.util.List;
import java.util.Arrays;
import java.util.stream.IntStream;

public class CollectionSum {

  private Integer sum(List<Integer> array){
    return array.stream().mapToInt(it -> it).sum();
  }

  public static void main(String[] args){
    List<Integer> array = Arrays.asList(1,2,3,4,10,11);
    Integer result = new CollectionSum().sum(array);
    System.out.println(result);
  }

}
