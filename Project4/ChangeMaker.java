/*
 * Justin Herrera
 * jherre34@calpoly.edu
 * Juan Ramirez
 * jramir94@calpoly.edu
 *
 * Project 4
 * Friday, March 2, 2018
 */

import java.util.Scanner;

public class ChangeMaker
{
    public static void main(String[] args)
    {
        int numCoins, n, plusFlag, sum_DP, sum_Greedy;
        int[] d, coinsUsed_DP, coinsUsed_greedy;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of coins: ");
        numCoins = scanner.nextInt();

        if (numCoins <= 0) {
            System.out.println("Please enter a value greater than 0.");
            System.exit(0);
        }

        d = new int[numCoins];
        System.out.print("Enter denominations of coins (in decreasing order): ");
        for(int i = 0; i < numCoins; i++) d[i] = scanner.nextInt();

        System.out.println();

        System.out.println("Enter a positive amount to be changed (enter 0 to quit):");
        n = scanner.nextInt();
        while (n != 0)
        {
            if (n < 0) {
                System.out.print("Please enter change greater than 0: ");
                n = scanner.nextInt();
                continue;
            }

            sum_DP = 0;
            sum_Greedy = 0;

            /* DP RESULTS */
            coinsUsed_DP = change_DP(n, d);
            System.out.println("\nDP algorithm results");
            System.out.println("Amount: " + n);
            System.out.print("Optimal distribution: ");
            plusFlag = 0;
            for (int i = 0; i < coinsUsed_DP.length; i++){
                if (plusFlag == 1 && coinsUsed_DP[i] != 0)
                    System.out.print(" + ");
                if (coinsUsed_DP[i] != 0) {
                    System.out.print(coinsUsed_DP[i] + "*" + d[i] + "c");
                    plusFlag = 1;
                }
                sum_DP = sum_DP + coinsUsed_DP[i];
            }
            System.out.println("\nOptimal coin count: " + sum_DP);

            /* GREEDY RESULTS */
            coinsUsed_greedy = change_greedy(n, d);
            System.out.println("\nGreedy algorithm results");
            System.out.println("Amount: " + n);
            System.out.print("Optimal distribution: ");
            plusFlag = 0;
            for (int i = 0; i < coinsUsed_greedy.length; i++){
                if (plusFlag == 1 && coinsUsed_greedy[i] != 0)
                    System.out.print(" + ");
                if (coinsUsed_greedy[i] != 0) {
                    System.out.print(coinsUsed_greedy[i] + "*" + d[i] + "c");
                    plusFlag = 1;
                }
                sum_Greedy = sum_Greedy + coinsUsed_greedy[i];
            }
            System.out.println("\nOptimal coin count: " + sum_Greedy);

            /* Reprompt user */
            System.out.println("\nEnter a positive amount to be changed (enter 0 to quit):");
            n = scanner.nextInt();
        }

        System.out.println("Thanks for playing. Good Bye.");
    }

    /**
     * Method that takes in an amount and denominations
     **/
    public static int[] change_DP(int n, int d[])
    {
        int C[] = new int[n + 1]; // Table 2B built: C[n] contains optimal sol
        int R[] = new int[n + 1]; // Decision array
        int result[] = new int[d.length]; // return array

        for (int i = 1; i <= n; i++) {
            C[i] = Integer.MAX_VALUE;
            R[i] = -1;
        }

        for (int i = 0; i < result.length; i++)
            result[i] = 0;

        C[0] = 0;

        for (int i = 1; i <= n; i++)
        {
            for (int j = 0; j < d.length; j++)
            if (d[j] <= i)
            {
                int temp = C[i - d[j]];
                if (temp != Integer.MAX_VALUE && temp + 1 < C[i]) {
                    C[i] = temp + 1;
                    R[i] = j;
                }
            }
        }

        if (R[R.length - 1] == -1)
        {
            System.out.println("\nNo Solution");
            System.exit(0);
        }

        return getCoinsUsed(result, R, d);
    }

    public static int[] change_greedy(int n, int d[])
    {
        int result[] = new int[d.length];
        int numCoins;

        for (int i = 0; i < d.length; i++) {
            result[i] = 0;
            numCoins = n / d[i];
            result[i] = numCoins;
            n = n - (numCoins * d[i]);
        }

        if (n > 0) {
            System.out.println("No Solution.");
            System.exit(1);
        }

        return result;
    }

    public static int[] getCoinsUsed(int result[], int R[], int d[])
    {
        int start = R.length - 1;
        int coin;

        while (start != 0)
        {
            coin = R[start];
            result[coin] = result[coin] + 1;
            start = start - d[coin];
        }

        return result;
    }
}
