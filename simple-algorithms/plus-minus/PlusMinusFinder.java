import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class PlusMinusFinder {

  private float[] find(List<Integer> numbers){
  	float[] result = new float[3];
    result[0] = numbers.stream().filter(it -> it > 0).count() / (float)numbers.size();
    result[1] = numbers.stream().filter(it -> it < 0).count() / (float)numbers.size();
    result[2] = numbers.stream().filter(it -> it == 0).count() / (float)numbers.size();
    return result;
  }

	public static void main(String[] args){
	  List<Integer> numbers = Arrays.asList(-4,3,-9,0,4,1);
	  float[] result = new PlusMinusFinder().find(numbers);
	  assert 0.5f == result[0];
	  assert 0.33333334f == result[1];
	  assert 0.16666667f == result[2];
	}

}