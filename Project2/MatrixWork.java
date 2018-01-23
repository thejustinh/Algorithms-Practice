import java.util.Scanner;
import java.io.File;

public class MatrixWork { 
//   public static int[][] matrixProduct(int[][] A, int[][] B) {
//        return 0; 
//   }

   public static void main(String[] args) {
      File file;
      System.out.print("Enter the file name: ");
      Scanner scanner = new Scanner(System.in);
      int rowA, rowB, colsA, colsB;

      try {
         file = new File(scanner.nextLine());
         scanner = new Scanner(file);
         rowA = scanner.nextInt();
         colA = scanner.nextInt();
      } catch(Exception e) {
         e.printStackTrace();
      }

      int[][] firstMatrix = new int[rowA][colA];
      
      for(int i = 0; i < rowA; i++) {
         for(int j = 0; j < colA; j++) {
            if(scanner.hasNextInt()) {
               firstMatrix[i][j] = scanner.nextInt();
            }
         }
      }

      scanner.close();
   }
}
