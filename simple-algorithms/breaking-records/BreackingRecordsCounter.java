import java.util.List;
import java.util.Arrays;

public class BreackingRecordsCounter {

	private Pair count(List<Integer> scores){
    Integer highest = scores.get(0);
    Integer lowest = scores.get(0);
    Integer highestCounter = 0;
    Integer lowestCoutner = 0;
 
    for(Integer score : scores){
      if(score > highest) {
        highestCounter++;
        highest = score;
      }
      if(score < lowest){
        lowestCoutner++;
        lowest = score;
      }
    }
 
 		return new Pair(highestCounter, lowestCoutner);
  }

	public static void main(String[] args){
		List<Integer> scores = Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1);
		Pair result = new BreackingRecordsCounter().count(scores);
		assert 2 == result.getHighest();
		assert 4 == result.getLowest();
	}

}


