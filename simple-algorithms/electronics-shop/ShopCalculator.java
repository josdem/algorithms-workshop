import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Map;

public class ShopCalculator {

	private Integer calculate(List<Integer> keyboards, List<Integer> usbs){
		List<Map.Entry<Integer,Integer>> pairList = new ArrayList<Map.Entry<Integer,Integer>>();
		keyboards.forEach( k ->
		  System.out.println(k)
		);
    return 0;
	}

	public static void main(String[] args){
		List<Integer> keyboards = Arrays.asList(3, 1);
		List<Integer> usbs = Arrays.asList(5, 2, 8);
		Integer result = new ShopCalculator().calculate(keyboards, usbs);
		assert 9 == result;
	}
	
}