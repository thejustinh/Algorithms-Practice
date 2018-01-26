public class MatrixProduct {
   public static int[][] matrixProduct_DAC(int[][] A, int[][] B) {
      int C = new int[A.length][A[0].length];
      int[] C11, C12, C21, C22;

      if(A.length == 1) {
         C[1][1] = A[A.length][A[0].length] * B[B.length][B[0].length];
      }
      else {
         
      }
   }

   public static int[][] matrixProduct_Strassen(int[][] A, int[][] B) {
      
   }

   private static void isValid(int[][] A, int[][] B) {
      if((A.length != A[0].length) || B.length != B[0].length || A.length != B.length || ((A.length & -A.length) != A.length)) {
         throw new IllegalArgumentException("Error: Illegal arguments.");
      }
   }
}
