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

      printResults(n_Change, denoms);

      System.out.println("Optimal is: " + change_DP(n_Change, denoms));
   }

    /**
     * Method that takes in an amount and denominations
     **/
    public static int change_DP(int n, int d[])
    {
        int C[] = new int[n + 1];
        int A[] = new int[d.length];

        for (int i = 1; i <= n; i++)
            C[i] = Integer.MAX_VALUE;

        C[0] = 0;

        for (int i = 1; i <= n; i++)
        {
            for (int j = 0; j < d.length; j++)
            if (d[j] <= i)
            {
                int temp = C[i - d[j]];
                if (temp != Integer.MAX_VALUE && temp + 1 < C[i]) {
                    C[i] = temp + 1;

                }
            }
        }

        return C[n];
    }



    private static void printResults(int n, int[] d) {
        System.out.println("\nDP algorithm results");
        System.out.println("Amount: " + n);
        System.out.println("Optimal distribution: " + " ");
        System.out.println("Optimal coin count: " );
    }
}
