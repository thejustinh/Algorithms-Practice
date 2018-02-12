import java.util.Scanner;

public class GameProblem {

  public static void main (String[] args) {

    Scanner scanner = new Scanner( System.in );

    System.out.print("Enter a filename: " );
    String filename = scanner.nextLine();

    try {
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);
    } catch (Exception e) {
      e.printStackTrace();
    }

    int n = inputFile.nextInt();
    int m = inputFile.nextInt();
    int[][] A = new int[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (inputFile.hasNextInt())
          A[i][j] = inputFile.nextInt();
      }
    }

  }

  public static void game(int n, int m, int[][] A) {



  }

}
