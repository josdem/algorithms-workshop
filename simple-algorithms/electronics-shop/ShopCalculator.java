import java.util.List;
import java.util.Arrays;

public class ShopCalculator {

	private Integer calculate(List<Integer> keyboards, List<Integer> usbs){
    return 0;
	}

	public static void main(String[] args){
		List<Integer> keyboards = Arrays.asList(3, 1);
		List<Integer> usbs = Arrays.asList(5, 2, 8);
		Integer result = new ShopCalculator().calculate(keyboards, usbs);
		assert 9 == result;
	}
	
}