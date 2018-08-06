public class DiagonalMatrix {
  // - Create (dynamically) a two dimensional array
  //   with the following matrix. Use a loop!
  //
  //   1 0 0 0
  //   0 1 0 0
  //   0 0 1 0
  //   0 0 0 1
  //
  // - Print this two dimensional array to the output

  public static void main(String[] args) {
    int[][] diagonal = createArray(10);
    printArray(diagonal);
  }

  public static void printArray(int[][] input) {
    for (int i = 0; i < input.length; i++) {
      for (int j = 0; j < input[i].length; j++) {
        System.out.print(input[i][j]);
        if (j == input[i].length - 1) System.out.println("");
      }
    }
  }

  public static int[][] createArray(int x) {
    int[][] diagonal = new int[x][x];
    for (int i = 0; i < x; i++) {
      for (int j = 0; j < x; j++) {
        if (i == j) diagonal[i][j] = 1;
        else diagonal[i][j] = 0;
      }
    }
    return diagonal;
  }

}
