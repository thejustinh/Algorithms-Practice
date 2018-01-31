public class MatrixProductTests {

  public static void main(String[] args) {

    MatrixProduct mp = new MatrixProduct();

    int[][] two1 = {{1, 2},
                    {3, 4}};
    int[][] two2 = {{1, 2},
                    {3, 4}};

    int[][] four1 = {{2, 4, 6, 8},
                     {1, 3, 5 ,7},
                     {1, 2, 3, 4},
                     {5, 6, 7, 8}};

    int[][] four2 = {{1, 5, 5, 1},
                     {2, 6, 6 ,2},
                     {3, 7, 7, 3},
                     {4, 8, 8, 4}};

    int[][] eight1 = {{1, 4, 3, 6, 5, 8, 7, 0},
                      {2, 5, 2, 7, 4, 9, 6, 9},
                      {3, 6, 1, 8, 3, 0, 5, 8},
                      {4, 7, 2, 9, 2, 9, 4, 7},
                      {5, 8, 3, 0, 1, 8, 3, 6},
                      {6, 9, 4, 9, 2, 7, 2, 5},
                      {7, 0, 5, 8, 3, 6, 1, 4},
                      {8, 9, 6, 7, 4, 5, 2, 3}};

    int[][] eight2 = {{1, 2, 3, 4, 5, 6, 7, 8},
                      {8, 7, 6, 5, 4, 3, 2, 1},
                      {1, 2, 3, 4, 5, 6, 7, 8},
                      {8, 7, 6, 5, 4, 3, 2, 1},
                      {1, 2, 3, 4, 5, 6, 7, 8},
                      {8, 7, 6, 5, 4, 3, 2, 1},
                      {1, 2, 3, 4, 5, 6, 7, 8},
                      {8, 7, 6, 5, 4, 3, 2, 1}};

    int[][] sixteen1 = {{1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4}};

    int[][] sixteen2 = {{1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4}};

    // Non square matrix (4 x 3)
    int[][] notSquare = {{1, 2, 3},
                         {1, 2, 3},
                         {1, 2, 3},
                         {1, 2, 3}};

    // Non square matrix (3 x 4)
    int[][] notSquare2 = {{1, 2, 3, 4},
                          {1, 2, 3, 4},
                          {1, 2, 3, 4}};

    // Not power of 2
    int[][] notPower =  {{1, 2, 3, 4, 5},
                         {1, 2, 3, 4, 5},
                         {1, 2, 3, 4, 5},
                         {1, 2, 3, 4, 5},
                         {1, 2, 3, 4, 5}};

    // Not power of 2
    int[][] notPower2 = {{1, 2, 3, 4, 5},
                         {1, 2, 3, 4, 5},
                         {1, 2, 3, 4, 5},
                         {1, 2, 3, 4, 5},
                         {1, 2, 3, 4, 5}};

    //int[][] invalid1 = matrixProduct_DAC(notSquare, A);
    //int[][] invalid2 = matrixProduct_DAC(A, notSquare2);
    //int[][] invalid3 = matrixProduct_DAC(notSquare, notSquare2);
    //int[][] invalid4 = matrixProduct_DAC(notPower, notPower2);
    //int[][] invalid5 = matrixProduct_DAC(eight1, E);

    int[][] twoXtwo_DAC = mp.matrixProduct_DAC(two1, two2);
    int[][] eightXeight_DAC = mp.matrixProduct_DAC(eight1, eight2);
    int[][] sixteenXsixteen_DAC = mp.matrixProduct_DAC(sixteen1, sixteen2);
    int[][] fourXfour_DAC = mp.matrixProduct_DAC(four1, four2);

    int[][] twoXtwo_strassen = mp.matrixProduct_Strassen(two1, two2);
    int[][] eightXeight_strassen = mp.matrixProduct_Strassen(eight1, eight2);
    int[][] sixteenXsixteen_strassen = mp.matrixProduct_Strassen(sixteen1, sixteen2);
    int[][] fourXfour_strassen = mp.matrixProduct_Strassen(four1, four2);

    System.out.println("******** 2 x 2 ********\n");
    System.out.println("DAC");
    printMatrix(twoXtwo_DAC);
    System.out.println("\nStrassen");
    printMatrix(twoXtwo_strassen);

    System.out.println("\n******** 4 x 4 ********\n");
    System.out.println("\nDAC");
    printMatrix(fourXfour_DAC);
    System.out.println("\nStrassen");
    printMatrix(fourXfour_strassen);

    System.out.println("\n******** 8 x 8 ********\n");
    System.out.println("DAC");
    printMatrix(eightXeight_DAC);
    System.out.println("\nStrassen");
    printMatrix(eightXeight_strassen);

    System.out.println("\n******** 16 x 16 ********\n");
    System.out.println("DAC");
    printMatrix(sixteenXsixteen_DAC);
    System.out.println("\nStrassen");
    printMatrix(sixteenXsixteen_strassen);

    System.out.println("\n******** Invalid Matrices ********");
    //printMatrix(invalid1);
    System.out.println();
    //printMatrix(invalid2);
    System.out.println();
    //printMatrix(invalid3);
    System.out.println();
    //printMatrix(invalid4);
    System.out.println();
    //printMatrix(invalid5);
    System.out.println();

  }


  private static void printMatrix(int[][] A) {

    int size = A.length;

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        System.out.print(A[i][j] + " ");
      }
      System.out.println();
    }
  }
}
