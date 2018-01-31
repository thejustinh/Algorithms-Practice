/**
 * Written by:
 * Justin Herrera
 * jherre34@calpoly.edu
 * Juan Ramirez
 * jramir94@calpoly.edu
 *
 * Project 2
 * Friday, February 2nd, 2018
 */

public class MatrixProduct {

  private static void isValid(int[][] A, int[][] B) {

    if((A.length != A[0].length) || B.length != B[0].length ||
        A.length != B.length || ((A.length & -A.length) != A.length)) {
      throw new IllegalArgumentException("Error: Illegal arguments.");
    }

  }

  public static int[][] matrixProduct_DAC(int[][] A, int[][] B) {

    isValid(A, B);

    return matrixProduct_DAC(A, 0, 0, B, 0, 0, A.length);

  }

  public static int[][] matrixProduct_Strassen(int[][] A, int[][] B) {

    isValid(A, B);

    return matrixProduct_Strassen(A, 0, 0, B, 0, 0, A.length);

  }

  private static int[][] matrixProduct_DAC(int[][] A, int rowA, int colA, int[][] B, int rowB, int colB, int size) {

    int[][] C11, C12, C21, C22;

    int[][] result = new int[size][size];

    int newSize = size / 2;

    if (size == 1) {

      result[0][0] = A[rowA][colA] * B[rowB][colB];

    } else {

      // C11 = A11 * B11 + A12 * B21
      C11 = sumDAC(matrixProduct_DAC(A, rowA, colA, B, rowB, colB, newSize),
                   matrixProduct_DAC(A, rowA, colA + newSize, B, rowB + newSize, colB, newSize));

      // C12 = A11 * B12 + A12 * B22
      C12 = sumDAC(matrixProduct_DAC(A, rowA, colA, B, rowB, colB + newSize, newSize),
                   matrixProduct_DAC(A, rowA, colA + newSize, B, rowB + newSize, colB + newSize, newSize));

      // C21 = A21 * B11 + A22 * B21
      C21 = sumDAC(matrixProduct_DAC(A, rowA + newSize, colA, B, rowB, colB, newSize),
                   matrixProduct_DAC(A, rowA + newSize, colA + newSize, B, rowB + newSize, colB, newSize));

      // C22 = A21 * B12 + A22 * B22
      C22 = sumDAC(matrixProduct_DAC(A, rowA + newSize, colA, B, rowB, colB + newSize, newSize),
                   matrixProduct_DAC(A, rowA + newSize, colA + newSize, B, rowB + newSize, colB + newSize, newSize));

      // copy C11, C12, C21, C22 into result
      for (int i = 0; i < newSize; i++) {
        for (int j = 0; j < newSize; j++) {
          result[i][j] = C11[i][j];
          result[i][j + newSize] = C12[i][j];
          result[i + newSize][j] = C21[i][j];
          result[i + newSize][j + newSize] = C22[i][j];
        }
      }

    }

    return result;

  }

  private static int[][] matrixProduct_Strassen(int[][] A, int rowA, int colA, int[][] B, int rowB, int colB, int size) {

    int[][] S1, S2, S3, S4, S5, S6, S7, S8, S9, S10;
    int[][] P1, P2, P3, P4, P5, P6, P7;
    int[][] C11, C12, C21, C22;

    int[][] result = new int[size][size];

    int newSize = size / 2;

    if (size == 1) {

      result[0][0] = A[rowA][colA] * B[rowB][colB];

    } else {

      // S1 = B12 - B22
      S1 = subtractStrassen(B, rowB, colB + newSize, B, rowB + newSize, colB + newSize, newSize);
      // S2 = A11 + A12
      S2 = sumStrassen(A, rowA, colA, A, rowA, colA + newSize, newSize);
      // S3 = A21 + A22
      S3 = sumStrassen(A, rowA + newSize, colA, A, rowA + newSize, colA + newSize, newSize);
      // S4 = B21 - B11
      S4 = subtractStrassen(B, rowB + newSize, colB, B, rowB, colB, newSize);
      // S5 = A11 + A22
      S5 = sumStrassen(A, rowA, colA, A, rowA + newSize, colA + newSize, newSize);
      // S6 = B11 + B22
      S6 = sumStrassen(B, rowB, colB, B, rowB + newSize, colB + newSize, newSize);
      // S7 = A12 - A22
      S7 = subtractStrassen(A, rowA, colA + newSize, A, rowA + newSize, colA + newSize, newSize);
      // S8 = B21 + B22
      S8 = sumStrassen(B, rowB + newSize, colB, B, rowB + newSize, colB + newSize, newSize);
      // S9 = A11 - A21
      S9 = subtractStrassen(A, rowA, colA, A, rowA + newSize, colA, newSize);
      // S10 = B11 + B12
      S10 = sumStrassen(B, rowB, colB, B, rowB, colB + newSize, newSize);


      // P1 = A11 * S1
      P1 = matrixProduct_Strassen(A, rowA, colA, S1, 0, 0, newSize);
      // P2 = S2 * B22
      P2 = matrixProduct_Strassen(S2, 0, 0, B, rowB + newSize, colB + newSize, newSize);
      // P3 = S3 * B11
      P3 = matrixProduct_Strassen(S3, 0, 0, B, rowB, colB, newSize);
      // P4 = A22 * S4
      P4 = matrixProduct_Strassen(A, rowA + newSize, colA + newSize, S4, 0, 0, newSize);
      // P5 = S5 * S6
      P5 = matrixProduct_Strassen(S5, 0, 0, S6, 0, 0, newSize);
      // P6 = S7 * S8
      P6 = matrixProduct_Strassen(S7, 0, 0, S8, 0, 0, newSize);
      // P7 = S9 * S10
      P7 = matrixProduct_Strassen(S9, 0, 0, S10, 0, 0, newSize);

      // C11 = P5 + P4 - P2 + P6
      C11 = sumStrassen(subtractStrassen(sumStrassen(P5, 0, 0, P4, 0, 0, newSize), 0, 0, P2, 0, 0, newSize), 0, 0, P6, 0, 0, newSize);
      // C12 = P1 + P2
      C12 = sumStrassen(P1, 0, 0, P2, 0, 0, newSize);
      // C21 = P3 + P4
      C21 = sumStrassen(P3, 0, 0, P4, 0, 0, newSize);
      // C22 = P5 + P1 - P3 - P7
      C22 = subtractStrassen(subtractStrassen(sumStrassen(P5, 0, 0, P1, 0, 0, newSize), 0, 0, P3, 0, 0, newSize), 0, 0, P7, 0, 0, newSize);

      // copy C11, C12, C21, C22 into result
      for (int i = 0; i < newSize; i++) {
        for (int j = 0; j < newSize; j++) {
          result[i][j] = C11[i][j];
          result[i][j + newSize] = C12[i][j];
          result[i + newSize][j] = C21[i][j];
          result[i + newSize][j + newSize] = C22[i][j];
        }
      }
    }

    return result;
  }

  private static int[][] sumDAC(int[][] A, int[][] B) {

    int[][] subResult = new int[A.length][A.length];

    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A.length; j++) {
        subResult[i][j] = A[i][j] + B[i][j];
      }
    }

    return subResult;

  }

  private static int[][] sumStrassen(int[][] A, int rowA, int colA, int[][] B, int rowB, int colB, int newSize) {

    int[][] subResult = new int[newSize][newSize];

    for (int i = 0; i < newSize; i++) {
      for (int j = 0; j < newSize; j++) {
        subResult[i][j] = A[i + rowA][j + colA] + B[i + rowB][j + colB];
      }
    }

    return subResult;

  }

  private static int[][] subtractStrassen(int[][] A, int rowA, int colA, int[][] B, int rowB, int colB, int newSize) {

    int[][] subResult = new int[newSize][newSize];

    for (int i = 0; i < newSize; i++) {
      for (int j = 0; j < newSize; j++) {
        subResult[i][j] = A[i + rowA][j + colA] - B[i + rowB][j + colB];
      }
    }

    return subResult;

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
