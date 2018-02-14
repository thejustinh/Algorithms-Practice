import java.util.Scanner;
import java.io.File;

public class GameProblem {

  public static void main (String[] args) {

    Scanner scanner = new Scanner( System.in );

    System.out.print("Enter a filename: " );
    String filename = scanner.nextLine();

    try {}
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
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void game(int n, int m, int[][] A) {
    int[][] S = new int[n][m];
    int[][] R = new int[n][m];

    for (i = 0; i < n; i++) {
      for (j = 0; j < m; j++) {
        if (i == n && j == m)
          //  (𝑡ℎ𝑖𝑠 𝑖𝑠 𝑡ℎ𝑒 𝑏𝑜𝑡𝑡𝑜𝑚−𝑟𝑖𝑔ℎ𝑡 𝑠𝑞𝑢𝑎𝑟𝑒: 𝑦𝑜𝑢 𝑐𝑎𝑛 𝑜𝑛𝑙𝑦 𝑒𝑥𝑖𝑡)
        else if (j == m)
          // 𝑚 (𝑡ℎ𝑖𝑠 𝑖𝑠 𝑡ℎ𝑒 𝑙𝑎𝑠𝑡 𝑐𝑜𝑙𝑢𝑚𝑛: 𝑚𝑜𝑣𝑒 𝑑𝑜𝑤𝑛 𝑜𝑟 𝑒𝑥𝑖𝑡)
        else if (i == m)
          // 𝑛 (𝑡ℎ𝑖𝑠 𝑖𝑠 𝑡ℎ𝑒 𝑙𝑎𝑠𝑡 𝑟𝑜𝑤: 𝑚𝑜𝑣𝑒 𝑟𝑖𝑔ℎ𝑡 𝑜𝑟 𝑒𝑥𝑖𝑡)
        else
          // (𝑐ℎ𝑒𝑐𝑘 𝑡ℎ𝑒 𝑏𝑒𝑡𝑡𝑒𝑟: 𝑚𝑜𝑣𝑒 𝑑𝑜𝑤𝑛 𝑜𝑟 𝑟𝑖𝑔ℎ𝑡)
      }
    }
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
