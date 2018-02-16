/*
 * Justin Herrera
 * jherre34@calpoly.edu
 * Juan Ramirez
 * jramir94@calpoly.edu
 *
 * Project 3
 * Friday, February 16, 2018
 */

import java.util.Scanner;
import java.io.File;

public class GameProblem {

  public static void main (String[] args) {

    Scanner scanner = new Scanner( System.in );

    System.out.print("Enter a filename: " );
    String filename = scanner.nextLine();

    try {
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);

      int n = inputFile.nextInt();
      int m = inputFile.nextInt();
      int[][] A = new int[n][m];

      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          if (inputFile.hasNextInt())
            A[i][j] = inputFile.nextInt();
        }
      }

      game(n, m, A);

    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public static void game(int n, int m, int[][] A) {

    int[][] S = new int[n][m];
    int[][] R = new int[n][m];
    int maxSum = Integer.MIN_VALUE;
    int maxRowIndex = Integer.MIN_VALUE;
    int maxColIndex = Integer.MIN_VALUE;

    for (int i = n - 1; i >= 0; i--) {
      for (int j = m - 1; j >= 0; j--) {
        if (i == n - 1 && j == m - 1) { // we are at the bottom right
          S[i][j] = A[i][j];
          R[i][j] = 0; // Exit flag
        } else if (j == m - 1) {
          S[i][j] = max(S[i + 1][m - 1], 0) + A[i][j];
          // Right column: Move down or exit
          if (S[i + 1][m - 1] > 0) // if bottomVal > 0
            R[i][j] = 1;
        } else if (i == n - 1) {
          S[i][j] = max(S[n - 1][j + 1], 0) + A[i][j];
          // Bottom row: Move right or exit
          if (S[n - 1][j + 1] > 0) // if rightVal > 0
            R[i][j] = 2;
        } else {
          S[i][j] = max(S[i + 1][j], S[i][j + 1]) + A[i][j];
          // Check better and move right or down
          if (S[i + 1][j] < S[i][j + 1])  // If bottomVal < rightVal
            R[i][j] = 2;
          else
            R[i][j] = 1;
        }

        if (maxSum < S[i][j]) {
          maxSum = S[i][j];
          maxRowIndex = i;
          maxColIndex = j;
        }
      }
    }

    System.out.println("Best Score: " + maxSum);
    printRoute(maxRowIndex, maxColIndex, R);

  }

  public static int max(int x, int y) {

      if (x > y)
        return x;

      return y;
  }

  public static int chooseMax(int x, int y, int[][] S, int[][] A, int[][] R) {

    int bottomVal = S[y + 1][x] + A[y][x];
    int rightVal = S[y][x + 1] + A[y][x];

    if (bottomVal > rightVal) {
      R[y][x] = 1; // Indicator to move down
      return bottomVal;
    }

    R[y][x] = 2; // Indicator to move right
    return rightVal;

  }

  public static void printRoute(int startRow, int startCol, int[][] R) {

    System.out.print("Best Route: ");

    while (R[startRow][startCol] != 0) {

      System.out.print("[" + (startRow+1) + "," + (startCol+1) + "] to ");

      if (R[startRow][startCol] == 2)
        startCol++;
      else if (R[startRow][startCol] == 1)
        startRow++;

    }

    System.out.print("[" + (startRow+1) + "," + (startCol+1) + "] to ");

    System.out.print("exit\n");

  }

  public static void printMatrix(int[][] A) {
    if (A != null) {
      for (int i = 0; i < A.length; i++) {
        for (int j = 0; j < A[0].length; j++) {
          System.out.print(A[i][j] + " ");
        }
        System.out.println();
      }
    }
  }
}
