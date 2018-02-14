public class Pair {

  private Integer first;
  private Integer last;

  public Pair(){}

  public Pair(Integer first, Integer last){
    this.first = first;
    this.last = last;
  }

  public void setFirst(Integer first){
    this.first = first;
  }

  public void setLast(Integer last){
    this.last = last;
  }

  public Integer getFirst(){
    return first;
  }

  public Integer getLast(){
    return last;
  }
  
}