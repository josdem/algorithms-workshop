import java.util.List;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class MinMaxFinder {

	private SortedSet<Integer> find(List<Integer> numbers){
	  return new TreeSet<Integer>();
	}

	public static void main(String[] args){
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		new MinMaxFinder().find(numbers);
	}
	
}