import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/*
  [1,0] => 15
  [ 5] => 5
	-------
  [1,5]
*/

public class CollectionAdder {

  List<Integer> integerAdder(int[] a, int[] b) {
  	int carrier = 0;
  	List<Integer> result = new ArrayList<Integer>();

 		if(a.length == 0 && b.length == 0){
  		return new ArrayList<Integer>();
 		}

 		int j = b.length-1;
 	 	for(int i=a.length-1; i>=0; i--){
  		int valueA = a[i];
  		int valueB = 0;

  		if(j>=0){
  			valueB = b[j];
  		}

  		int parcialValue = valueA + valueB + carrier;
  		int mod = parcialValue % 10;
  		result.add(0,mod);

  		carrier = parcialValue / 10;
  		j--;
  	}

  	if(carrier > 0){
  		result.add(0,carrier);
  	}

 		return result;
 	}
	

	public static void main(String[] args){
	  int[] first = {1,0};
	  int[] second = {5};
	  List<Integer> result = new CollectionAdder().integerAdder(first, second);
	  result.forEach(System.out::println);
	}

}