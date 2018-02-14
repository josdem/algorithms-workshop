import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

public class BreackingRecordsCounter {

	private Pair count(List<Integer> scores){
    final Integer start = scores.get(0);

    Set<Integer> high = scores.stream().filter(it -> it > start).collect(Collectors.toSet());
    Set<Integer> low = scores.stream().filter(it -> it < start).collect(Collectors.toSet());

		return new Pair(high.size(), low.size());
	}

	public static void main(String[] args){
		List<Integer> scores = Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1);
		Pair result = new BreackingRecordsCounter().count(scores);
		assert 2 == result.getHighest();
		assert 4 == result.getLowest();
	}

}


