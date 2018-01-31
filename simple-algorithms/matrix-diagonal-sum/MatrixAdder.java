public class MatrixAdder {

  private int sum(int[][] matrix){
    int diagonalA = 0;
    int diagonalB = 0;
    int n = matrix.length;

    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        if(i==j){
          diagonalA = diagonalA + matrix[i][j];
        }
        if(j==n-i-1){
          diagonalB = diagonalB + matrix[i][j];
        }
      }
    }
    return diagonalA + diagonalB;
  }

  public static void main(String[] args){
    int[][] matrix = {
      {9, 2, 4},
      {4, 5, 6},
      {1, 7, 8},
    };

    int result = new MatrixAdder().sum(matrix);
    System.out.println("sum: " + result);
  }

}
