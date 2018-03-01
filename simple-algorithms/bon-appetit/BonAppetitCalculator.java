import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class BonAppetitCalculator {

	private Integer compute(List<Integer> prices, int itemAvoided){
		Integer charged = prices.stream().mapToInt(Integer::intValue).sum() / 2;
		prices.remove(itemAvoided);
		Integer fair = prices.stream().mapToInt(Integer::intValue).sum() / 2;
		return charged - fair;
	}

	public static void main(String[] args){
		List<Integer> prices = new LinkedList<Integer>(Arrays.asList(3, 10, 2, 9));
		int itemAvoided = 1;
		Integer result = new BonAppetitCalculator().compute(prices, itemAvoided);
		assert 5 == result;
	}
	
}