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

      printMatrix(A);

      System.out.println("\n\n***** Running Game Solution *****\n");
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

    // Fill S-Table with A's most right column and most bottom row
    for (int i = 0; i < A.length; i++) {
      S[i][m - 1] = A[i][m - 1];
    }
    for (int j = 0; j < A[0].length; j++) {
      S[n - 1][j] = A[n - 1][j];
    }

    // Fill the rest of the S-Table
    for (int k = m - 1 - 1; k >= 0; k--) {
      for (int i = n - 1 - 1; i >= 0; i--) {
        S[k][i] = chooseMax(i, k, S, A, R);
        if (maxSum < S[k][i]){
          maxSum = S[k][i];
          maxRowIndex = k;
          maxColIndex = i;
        }
      }
      for (int j = m - 1 - 1; j >= 0; j--) {
        S[j][k] = chooseMax(k, j, S, A, R);
        if (maxSum < S[j][k]) {
          maxSum = S[j][k];
          maxRowIndex = j;
          maxColIndex = k;
        }
      }
    }

    System.out.println("\nSum Matrix");
    printMatrix(S);
    System.out.println("\nRoute Matrix");
    printMatrix(R);
    System.out.println("\nBest Score: " + maxSum);
    printRoute(maxRowIndex, maxColIndex, R);
    
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

    while (startRow < R.length && startCol < R[0].length) {

      System.out.print("[" + (startRow+1) + "," + (startCol+1) + "] to ");

      if (R[startRow][startCol] == 2)
        startCol++;
      else if (R[startRow][startCol] == 1)
        startRow++;
      else if (R[startRow][startCol] == 0)
        break;
    }

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
