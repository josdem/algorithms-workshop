import java.lang.Math;

public class MatrixDiagonalSubstractor {

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
    return Math.abs(diagonalA - diagonalB);
  }

  public static void main(String[] args){
    int[][] matrix = {
      {11, 2,  4},
      { 4, 5,  6},
      {10, 8,-12},
    };

    int result = new MatrixDiagonalSubstractor().sum(matrix);
    assert 15 == result;
  }

}
