public class Pair {
  private Integer highest;
  private Integer lowest;

  public Pair(){}

  public Pair(Integer highest, Integer lowest){
    this.highest = highest;
    this.lowest = lowest;
  }

  public void setHighest(Integer highest){
    this.highest = highest;
  }

  public void setLowest(Integer lowest){
    this.lowest = lowest;
  }

  public Integer getHighest(){
    return highest;
  }

  public Integer getLowest(){
    return lowest;
  }
}