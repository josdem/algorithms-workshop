import java.util.List;
import java.util.Arrays;

public class BirthdayCakeCandlesCounter {

	private Integer count(List<Integer> sizes){
		return 0;
	}
	
	public static void main(String[] args){
		List<Integer> sizes = Arrays.asList(3, 2, 1, 3);
		Integer result = new BirthdayCakeCandlesCounter().count(sizes);
		assert 2 == result;
	}

}