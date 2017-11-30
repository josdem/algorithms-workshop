import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class DigitalSumSorter {

	private List<Integer> sort(List<Integer> numbers){
		List<String> numbersAsString = new ArrayList<String>();
		numbersAsString = numbers.stream().map(it -> it.toString()).collect(Collectors.toList());
		numbersAsString.forEach(System.out::println);
		return new ArrayList<Integer>();
	}

	public static void main(String[] args){
		List<Integer> numbers = Arrays.asList(13, 20, 7, 4);
		List<Integer> result = new DigitalSumSorter().sort(numbers);
		result.forEach(System.out::println);
	}
	
}


 