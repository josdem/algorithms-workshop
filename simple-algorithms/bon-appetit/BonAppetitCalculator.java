import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class BonAppetitCalculator {

	private Integer compute(List<Integer> prices, Integer itemAvoided){
		Integer charged = prices.stream().mapToInt(Integer::intValue).sum() / 2;
		prices.remove(itemAvoided);
		Integer fair = sharedItems.stream().mapToInt(Integer::intValue).sum() / 2;

		return charged - fair;
	}

	public static void main(String[] args){
		List<Integer> prices = Arrays.asList(3, 10, 2, 9);
		Integer itemAvoided = 1;
		Integer result = new BonAppetitCalculator().compute(prices, itemAvoided);
		assert 5 == result;
	}
	
}