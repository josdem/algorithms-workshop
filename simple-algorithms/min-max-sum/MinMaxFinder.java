import java.util.List;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class MinMaxFinder {

	private SortedSet<Integer> find(List<Integer> numbers){
		SortedSet<Integer> collection = new TreeSet<Integer>();
		for(int i=0; i<numbers.size(); i++){
			collection.add(numbers.stream().mapToInt(it -> it).sum() - numbers.get(i));
		}
	  return collection;
	}

	public static void main(String[] args){
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		SortedSet<Integer> result = new MinMaxFinder().find(numbers);
		assert 10 == result.first();
		assert 14 == result.last();
	}
	
}