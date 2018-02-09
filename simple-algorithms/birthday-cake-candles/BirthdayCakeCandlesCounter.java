import java.util.List;
import java.util.Arrays;
import java.util.Optional;

public class BirthdayCakeCandlesCounter {

	private Integer count(List<Integer> sizes){
		Optional<Integer> max = sizes.stream().max(Integer::compare);
		Long result = sizes.stream().filter(it -> it == max.get()).count();
		return result.intValue();
	}
	
	public static void main(String[] args){
		List<Integer> sizes = Arrays.asList(3, 2, 1, 3);
		Integer result = new BirthdayCakeCandlesCounter().count(sizes);
		assert 2 == result;
	}

}