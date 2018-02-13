import java.util.List;
import java.util.Arrays;

public class BreackingRecordsCounter {

	private Pair count(){
		return new Pair();
	}

	public static void main(String[] args){
		List<Integer> scores = Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1);
		Pair result = new BreackingRecordsCounter().count();
		assert 2 == result.getHighest();
		assert 4 == result.getLowest();
	}
}

