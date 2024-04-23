public class BinarySearch {

  int logarithmic(Integer[] data, int target) {
    int startIndex = 0;
    int endIndex = data.length - 1;

    while (startIndex < endIndex) {
      int midIndex = (endIndex - startIndex ) / 2 + startIndex;
      int midValue = data[midIndex];

      if (target > midValue) {
        startIndex = midIndex;
      } else if (target < midValue) {
        endIndex = midIndex - 1;
      } else {
        return midIndex;
      }
    }
    return -1;
  }

  public static void main(String[] args){
    BinarySearch binarySearch = new BinarySearch();
    Integer[] myData = {1,2,3,4,5,6,7,8,9,10};
    System.out.println("value: " + binarySearch.logarithmic(myData,5));
  }

}