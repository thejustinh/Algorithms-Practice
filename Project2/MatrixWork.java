import java.util.Scanner;
import java.io.File;
import java.lang.IllegalArgumentException;

public class MatrixWork { 
   public static int[][] matrixProduct(int[][] A, int[][] B) {
        if(A[0].length != B.length) {
           throw new IllegalArgumentException("colsA != rowB");
        }
        int[][] productMatrix = new int[A.length][B[0].length]; 

        for(int i = 0; i < A.length; i++) { // rowA
           for(int j = 0; j < B[0].length; j++) { // colsB
              for(int k = 0; k < A[0].length; k++) { // colsA
                 productMatrix[i][j] = productMatrix[i][j] + A[i][k] * B[k][j];
              }
           }
        }
        return productMatrix;
   }

   public static void main(String[] args) {
      File file;
      System.out.print("Enter the file name: ");
      Scanner scanner = new Scanner(System.in);
      int rowA = 0;
      int rowB = 0;
      int colsA = 0;
      int colsB = 0;

      try {
         file = new File(scanner.nextLine());
         scanner = new Scanner(file);
         rowA = scanner.nextInt();
         colsA = scanner.nextInt();
      } catch(Exception e) {
         e.printStackTrace();
         
      }

      int[][] firstMatrix = new int[rowA][colsA];

      for(int i = 0; i < rowA; i++) {
         for(int j = 0; j < colsA; j++) {
            if(scanner.hasNextInt()) {
               firstMatrix[i][j] = scanner.nextInt();
            }
         }
      }

      rowB = scanner.nextInt();
      colsB = scanner.nextInt();

      int[][] secondMatrix = new int[rowB][colsB];
  
      for(int i = 0; i < rowB; i++) {
         for(int j = 0; j < colsB; j++) {
            if(scanner.hasNextInt()) {
               secondMatrix[i][j] = scanner.nextInt();
            }
         }
      }
      scanner.close();

      int[][] thirdMatrix = matrixProduct(firstMatrix, secondMatrix);

//      printMatrix(firstMatrix);
//      System.out.println();
//     printMatrix(secondMatrix);
      System.out.println("\nProduct matrix: ");
      printMatrix(thirdMatrix);
   }

   public static void printMatrix(int[][] A) {
      for(int i = 0; i < A.length; i++) {
         for(int j = 0; j < A[0].length; j++) {
            System.out.print(A[i][j] + " ");
         }
         System.out.println();
      }
   }
}
