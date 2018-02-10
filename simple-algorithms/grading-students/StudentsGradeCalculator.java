import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGradeCalculator {

  private List<Integer> compute(List<Integer> grades){
    return new ArrayList<Integer>();
  }

  public static void main(String[] args){
    List<Integer> grades = Arrays.asList(73, 67, 38, 33);
    List<Integer> result = new StudentsGradeCalculator().compute(grades);
    assert 4 == result.size();
    assert 75 == result.get(0);
    assert 67 == result.get(1);
    assert 40 == result.get(2);
    assert 33 == result.get(3);
  }
}
