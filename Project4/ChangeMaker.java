import java.util.Scanner;

public class ChangeMaker
{
    public static void main(String[] args)
    {
        int numCoins, n;
        int plusFlag = 0;
        int sum = 0;
        int[] d, coinsUsed;
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

        System.out.println("\nk = " + numCoins);
        System.out.print("d array contains: ");
        for(int i = 0; i < numCoins; i++) System.out.print(d[i] + " ");
        System.out.println();

        System.out.println("\nFor the following, enter '0' to quit.");
        System.out.print("Enter amount you need change for: ");

        n = scanner.nextInt();
        while (n != 0)
        {
            if (n < 0) {
                System.out.print("Please enter change greater than 0: ");
                n = scanner.nextInt();
                continue;
            } else
                System.out.println("Seeking change for " + n + " cents");

            /* DP RESULTS */
            coinsUsed = change_DP(n, d);
            System.out.println("\nDP algorithm results");
            System.out.println("Amount: " + n);
            System.out.print("Optimal distribution: ");
            for (int i = 0; i < coinsUsed.length; i++){
                if (plusFlag == 1 && coinsUsed[i] != 0)
                    System.out.print(" + ");
                if (coinsUsed[i] != 0) {
                    System.out.print(coinsUsed[i] + "*" + d[i] + "c");
                    plusFlag = 1;
                }
                sum = sum + coinsUsed[i];
            }
            System.out.println("\nOptimal coin count: " + sum);

            /* GREEDY RESULTS */
            coinsUsed = change_DP(n, d);
            System.out.println("\nGreedy algorithm results");
            System.out.println("Amount: " + n);
            System.out.print("Optimal distribution: ");
            for (int i = 0; i < coinsUsed.length; i++){
                if (plusFlag == 1 && coinsUsed[i] != 0)
                    System.out.print(" + ");
                if (coinsUsed[i] != 0) {
                    System.out.print(coinsUsed[i] + "*" + d[i] + "c");
                    plusFlag = 1;
                }
                sum = sum + coinsUsed[i];
            }
            System.out.println("\nOptimal coin count: " + sum);

            /* Reprompt user */
            System.out.println("\nFor the following, enter '0' to quit.");
            System.out.print("Enter amount you need change for: ");
            n = scanner.nextInt();
        }
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



    private static void printResults(int n, int[] d)
    {
        System.out.println("\nDP algorithm results");
        System.out.println("Amount: " + n);
        System.out.println("Optimal distribution: " + " ");
        System.out.println("Optimal coin count: " );
    }
}
