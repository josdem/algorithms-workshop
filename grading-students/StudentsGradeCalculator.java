import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StudentsGradeCalculator {

  private List<Integer> compute(List<Integer> grades){
    return grades
      .stream()
      .map(it -> (it >=38 && it % 5 >=3) ? it + 5 - it % 5 : it)
      .collect(Collectors.toList());
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
