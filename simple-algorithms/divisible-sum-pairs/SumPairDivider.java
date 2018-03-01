import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumPairDivider {

	private Integer compute(List<Integer> numbers){
		Integer result = 0;

		List<List<Integer>> sets =
      IntStream.range(0, numbers.size() - 2)
      .mapToObj(it -> numbers.subList(it, it + 2))
      .collect(Collectors.toList());

    for(List<Integer> set : sets){
    	set.forEach(System.out::println);
    	System.out.println("---");
    }  

		return result;
	}
	
	public static void main(String[] args){
		List<Integer> numbers = Arrays.asList(1, 3, 2, 6, 1, 2);
		Integer result = new SumPairDivider().compute(numbers);
		assert 5 == result;
	}

}