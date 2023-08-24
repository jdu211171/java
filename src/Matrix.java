import java.util.Arrays;

public class Matrix {
  
  static void createMatrix(int n){
    int[][] newMatrix = new int[n][n];
    for (int i = 0; i < n; i++){
      newMatrix[i][i] = 0;
    }
    setOneToMatrix(newMatrix, 0, newMatrix.length - 1);
    for (int[] row : newMatrix) System.out.println(Arrays.toString(row));
  }

  static int[][] setOneToMatrix(int[][] n, int begin, int end){
    for (int i = 0; i < n.length; i++) {
      n[i][begin++] = 1;
      n[i][end--] = 1;
    }
    return n;
  }

  public static void main(String[] args){
    createMatrix(5);
  }
}
