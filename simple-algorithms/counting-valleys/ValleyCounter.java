public class ValleyCounter {

  private Integer count(String path){
    return 0;
  }

  public static void main(String[] args){
    String path = "UDDDUDUU";
    Integer result = new ValleyCounter().count(path);
    assert 1 == result;
  }

}
