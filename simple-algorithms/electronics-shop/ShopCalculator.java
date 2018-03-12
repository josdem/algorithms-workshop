import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Optional;
import java.util.AbstractMap.SimpleEntry;

import java.util.stream.Collectors;

public class ShopCalculator {

	private Integer calculate(final Integer amount, List<Integer> keyboards, List<Integer> usbs){
		List<Map.Entry<Integer,Integer>> pairList = new ArrayList<Map.Entry<Integer,Integer>>();

		keyboards.forEach( k ->
		  usbs.forEach( u ->		  	
		  	pairList.add(new SimpleEntry<Integer,Integer>(k,u))
		  )
		);

		List<Integer> electronicsCost = pairList.stream().map(entry -> entry.getKey() + entry.getValue()).collect(Collectors.toList());

		Optional<Integer> result = electronicsCost.stream().filter(it -> it < amount).max(Integer::compare);
		
    return result.get();
	}

	public static void main(String[] args){
		List<Integer> keyboards = Arrays.asList(3, 1);
		List<Integer> usbs = Arrays.asList(5, 2, 8);
		Integer amount = 10;
		Integer result = new ShopCalculator().calculate(amount, keyboards, usbs);
		assert 9 == result;
	}
	
}