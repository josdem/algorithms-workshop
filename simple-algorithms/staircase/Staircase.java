public class Staircase {

  private void printStair(Integer size){
    for(int j=1; j<=size; j++){
      for(int i=1; i<=j; i++){
        System.out.print("#");
      }
      System.out.print("\n");
    }
  }

  public static void main(String[] args){
    Integer size = 4;
    new Staircase().printStair(size);
  }

}
