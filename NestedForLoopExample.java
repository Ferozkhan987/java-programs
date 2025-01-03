public class NestedForLoopExample {
  public static void main(String[] args) {
      int[][] matrix = {
          {1, 2, 3},
          {4, 5, 6},
          {7, 8, 9}
      };
      
      for (int i = 0; i < matrix.length; i++) {
          for (int j = 0; j < matrix[i].length; j++) {
              System.out.println("Element at (" + i + ", " + j + "): " + matrix[i][j]);
          }
      }
  }
}