import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class DigitalSumSorter {

	private List<Integer> sort(List<Integer> numbers){
		List<String> numbersAsString = new ArrayList<String>();
		numbersAsString = numbers.stream().map(it -> it.toString()).collect(Collectors.toList());
    List<Integer> result = numbersAsString.stream().map(it -> it.chars().map( ch -> Integer.parseInt(Character.toString((char) ch))).sum()).sorted().collect(Collectors.toList());
		return result;
	}

	public static void main(String[] args){
		List<Integer> numbers = Arrays.asList(15, 20, 4, 8);
		List<Integer> result = new DigitalSumSorter().sort(numbers);
    assert Arrays.asList(2,4,6,8).equals(result);
	}

}



