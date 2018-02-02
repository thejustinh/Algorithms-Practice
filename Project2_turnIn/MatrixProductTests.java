public class MatrixProductTests {

  public static void main(String[] args) {

    MatrixProduct mp = new MatrixProduct();

    int[][] two1 = {{1, 2},
                    {3, 4}};
    int[][] two2 = {{1, 2},
                    {3, 4}};
    int[][] two3 = {{-3, -4},
                    {-2, -1}};
    int[][] two4 = {{1, 2},
                    {3, 4}};
    int[][] two5 = {{0, 0},
                    {0, 0}};

    int[][] four1 = {{2, 4, 6, 8},
                     {1, 3, 5 ,7},
                     {1, 2, 3, 4},
                     {5, 6, 7, 8}};

    int[][] four2 = {{1, 5, 5, 1},
                     {2, 6, 6 ,2},
                     {3, 7, 7, 3},
                     {4, 8, 8, 4}};

    int[][] four3 = {{3, -5, -8, -4},
                     {-7, -1, -9, -2},
                     {-5, -7, -7, -3},
                     {-4, -8, -8, 4}};

    int[][] four4 = {{1, 1, 1, 1},
                     {2, 2, 2 ,2},
                     {3, 3, 3, 3},
                     {4, 4, 4, 4}};

    int[][] four5 = {{0, 0, 0, 0},
                     {0, 0, 0, 0},
                     {0, 0, 0, 0},
                     {0, 0, 0, 0}};

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

    int[][] eight3 = {{1, -2, -3, -4, 5, 6, 7, 8},
                      {8, 7, 6, 5, 4, -3, -2, -1},
                      {-1, 2, -3, 4, -5, 6, -7, 8},
                      {-8, -7, 6, -5, 4, 3, 2, 1},
                      {1, 2, -3, 4, 5, -6, -7, 8},
                      {8, 7, -6, -5, 4, 3, -2, -1},
                      {1, -2, 3, -4, 5, -6, -7, 8},
                      {-8, -7, 6, -5, 4, -3, -2, 1}};

    int[][] eight4 = {{8, 4, 3, 4, 5, 6, 7, -8},
                      {2, 7, -6, 5, 4, 3, 2, 1},
                      {6, 2, 5, 4, -1, 0, 7, 8},
                      {4, 4, 6, 5, 0, 3, 2, 1},
                      {1, 3, 0, 4, 5, 6, 7, 8},
                      {9, 5, 4, 5, 0, -3, 2, 1},
                      {5, 2, 3, 4, -5, 6, 7, 8},
                      {3, 7, 4, 5, 4, 3, -2, 1}};

    int[][] eight5 = {{0, 0, 0, 0, 0, 0, 0, 0},
                      {0, 0, 0, 0, 0, 0, 0, 0},
                      {0, 0, 0, 0, 0, 0, 0, 0},
                      {0, 0, 0, 0, 0, 0, 0, 0},
                      {0, 0, 0, 0, 0, 0, 0, 0},
                      {0, 0, 0, 0, 0, 0, 0, 0},
                      {0, 0, 0, 0, 0, 0, 0, 0},
                      {0, 0, 0, 0, 0, 0, 0, 0}};

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

    int[][] sixteen3 = {{-1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, -2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, -3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, -4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, -1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, -2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, -3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, -4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, -1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, -2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, -3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, -4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, -1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, -2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, -3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, -4}};

    int[][] sixteen4 = {{1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, -4, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, -4, 1, 2, 9, 4},
                        {1, 2, 3, 4, 1, 2, 3, 5, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 8, 3, -4, 1, 8, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, -6, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 3, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 2, 7, 2, 3, 2, 5, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 9, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 3, 4, 1, -4, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 2, 8, 4, 8, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, 7, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 5, 2, 3, 6, 1, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 2, 2, 3, 4, 9, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 5, 2, 5, 4, 3, 2, 3, 4, 1, 2, 3, 4},
                        {1, 2, 3, 4, 1, -2, 3, -4, 1, 2, 3, 4, 1, 2, 3, 4}};

    int[][] sixteen5 = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

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

    //int[][] invalid1 = mp.matrixProduct_DAC(notSquare, notSquare);
    //int[][] invalid2 = mp.matrixProduct_DAC(notPower2, notSquare2);
    //int[][] invalid3 = mp.matrixProduct_DAC(notSquare, notSquare2);
    //int[][] invalid4 = mp.matrixProduct_DAC(notPower, notPower2);
    //int[][] invalid5 = mp.matrixProduct_DAC(eight1, notSquare);

    int[][] twoXtwo_DAC1 = mp.matrixProduct_DAC(two1, two2);
    int[][] twoXtwo_strassen1 = mp.matrixProduct_Strassen(two1, two2);
    int[][] twoXtwo_DAC2 = mp.matrixProduct_DAC(two3, two4);
    int[][] twoXtwo_strassen2 = mp.matrixProduct_Strassen(two3, two4);
    int[][] twoXtwo_DAC3 = mp.matrixProduct_DAC(two5, two2);
    int[][] twoXtwo_strassen3 = mp.matrixProduct_Strassen(two5, two2);
    int[][] fourXfour_DAC1 = mp.matrixProduct_DAC(four1, four2);
    int[][] fourXfour_strassen1 = mp.matrixProduct_Strassen(four1, four2);
    int[][] fourXfour_DAC2 = mp.matrixProduct_DAC(four3, four4);
    int[][] fourXfour_strassen2 = mp.matrixProduct_Strassen(four3, four4);
    int[][] fourXfour_DAC3 = mp.matrixProduct_DAC(four5, four2);
    int[][] fourXfour_strassen3 = mp.matrixProduct_Strassen(four5, four2);
    int[][] eightXeight_DAC1 = mp.matrixProduct_DAC(eight1, eight2);
    int[][] eightXeight_strassen1 = mp.matrixProduct_Strassen(eight1, eight2);
    int[][] eightXeight_DAC2 = mp.matrixProduct_DAC(eight3, eight4);
    int[][] eightXeight_strassen2 = mp.matrixProduct_Strassen(eight3, eight4);
    int[][] eightXeight_DAC3 = mp.matrixProduct_DAC(eight5, eight2);
    int[][] eightXeight_strassen3 = mp.matrixProduct_Strassen(eight5, eight2);
    int[][] sixteenXsixteen_DAC1 = mp.matrixProduct_DAC(sixteen1, sixteen2);

    int[][] sixteenXsixteen_strassen1 = mp.matrixProduct_Strassen(sixteen1, sixteen2);
    int[][] sixteenXsixteen_DAC2 = mp.matrixProduct_DAC(sixteen3, sixteen4);

    int[][] sixteenXsixteen_strassen2 = mp.matrixProduct_Strassen(sixteen3, sixteen4);
    int[][] sixteenXsixteen_DAC3 = mp.matrixProduct_DAC(sixteen5, sixteen2);

    int[][] sixteenXsixteen_strassen3 = mp.matrixProduct_Strassen(sixteen5, sixteen2);

    System.out.println("******** 2 x 2 ********\n");
    System.out.println("DAC 1");
    printMatrix(twoXtwo_DAC1);
    System.out.println("\nStrassen 1");
    printMatrix(twoXtwo_strassen1);
    System.out.println("\nDAC 2");
    printMatrix(twoXtwo_DAC2);
    System.out.println("\nStrassen 2");
    printMatrix(twoXtwo_strassen2);
    System.out.println("\nDAC 3");
    printMatrix(twoXtwo_DAC3);
    System.out.println("\nStrassen 3");
    printMatrix(twoXtwo_strassen3);

    System.out.println("\n******** 4 x 4 ********\n");
    System.out.println("\nDAC 1");
    printMatrix(fourXfour_DAC1);
    System.out.println("\nStrassen 1");
    printMatrix(fourXfour_strassen1);
    System.out.println("\nDAC 2");
    printMatrix(fourXfour_DAC2);
    System.out.println("\nStrassen 2");
    printMatrix(fourXfour_strassen2);
    System.out.println("\nDAC 3");
    printMatrix(fourXfour_DAC3);
    System.out.println("\nStrassen 3");
    printMatrix(fourXfour_strassen3);

    System.out.println("\n******** 8 x 8 ********\n");
    System.out.println("DAC 1");
    printMatrix(eightXeight_DAC1);
    System.out.println("\nStrassen 1");
    printMatrix(eightXeight_strassen1);
    System.out.println("\nDAC 2");
    printMatrix(eightXeight_DAC2);
    System.out.println("\nStrassen 2");
    printMatrix(eightXeight_strassen2);
    System.out.println("\nDAC 3");
    printMatrix(eightXeight_DAC3);
    System.out.println("\nStrassen 3");
    printMatrix(eightXeight_strassen3);

    System.out.println("\n******** 16 x 16 ********\n");
    System.out.println("DAC 1");
    printMatrix(sixteenXsixteen_DAC1);
    System.out.println("\nStrassen 1");
    printMatrix(sixteenXsixteen_strassen1);
    System.out.println("\nDAC 2");
    printMatrix(sixteenXsixteen_DAC2);
    System.out.println("\nStrassen 2");
    printMatrix(sixteenXsixteen_strassen2);
    System.out.println("\nDAC 3");
    printMatrix(sixteenXsixteen_DAC3);
    System.out.println("\nStrassen 3");
    printMatrix(sixteenXsixteen_strassen3);

    System.out.println("\n******** Invalid Matrices ********");
    System.out.print("Uncomment invalid matrix tests to check.\n");
    //printMatrix(invalid1);
    //System.out.println();
    //printMatrix(invalid2);
    //System.out.println();
    //printMatrix(invalid3);
    //System.out.println();
    //printMatrix(invalid4);
    //System.out.println();
    //printMatrix(invalid5);
    //System.out.println();

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
