import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/*
I have two arrayLists with 5 integer. I want to find a way to return the common elements of the two lists.
*/

public class CommonElementsFinder {

  private List<Integer> find(List<Integer> first, List<Integer> second){
    return first.stream().filter(second::contains).collect(Collectors.toList());
  }

	public static void main(String[] args){
		List<Integer> first = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> second = Arrays.asList(1, 3, 5, 7, 9);
	  List<Integer> result = new CommonElementsFinder().find(first, second);
	  assert new ArrayList<Integer>(Arrays.asList(1,3,5)).equals(result);
	}

}
