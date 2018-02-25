import java.util.Scanner;

public class ChangeMaker {
   public static void main(String[] args) {
      int i, k_Coins, n_Change;
      int[] denoms;
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter number of coins: ");
      k_Coins = scanner.nextInt();
      denoms = new int[k_Coins];
      System.out.print("Enter denominations of coins (in decreasing order): ");
      for(i = 0; i < k_Coins; i++) {
         denoms[i] = scanner.nextInt();
      }

      System.out.println("\nk = " + k_Coins);
      System.out.print("d array contains: ");

      for(i = 0; i < k_Coins; i++) {
         System.out.print(denoms[i] + " ");
      }
      System.out.println();

      System.out.println("\nFor the following, enter '0' to quit.");
      System.out.print("Enter amount you need change for: ");

      n_Change = scanner.nextInt();
      if(n_Change == 0)
         System.exit(0);
      else
         System.out.println("Seeking change for " + n_Change + "cents");
/*
      while(n_Change > 0) {
         // run change_DP algorithm
      }
*/
      printResults(n_Change, denoms, k_Coins);
   }
/*
   public static int[] change_DP(int n, int[] d) {

   }
*/

   private static void printResults(int change, int[] d, int numCoins) {
      System.out.println("\nDP algorithm results");
      System.out.println("Amount: " + change);
      System.out.println("Optimal distribution: " + " ");
      System.out.println("Optimal coin count: " + numCoins);
   }
}
