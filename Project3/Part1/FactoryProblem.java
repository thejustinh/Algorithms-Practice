/*
 * Justin Herrera
 * jherre34@calpoly.edu
 * Juan Ramirez
 * jramir94@calpoly.edu
 *
 * Project 3
 * Friday, February 16, 2018
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.Thread;

public class FactoryProblem {
   public static final int TWO = 2;

   public static void main(String[] args) throws FileNotFoundException {
      File file;
      Scanner scanner = new Scanner(System.in);
      Scanner fileScanner;
      int numStations, i, j;
      int[] enter = new int[TWO];
      int[] exit = new int[TWO];
      int[][] stations, transfers;

      System.out.print("Enter name of file: ");
      file = new File(scanner.nextLine());
      System.out.println("File selected: " + file);
      fileScanner = new Scanner(file);

      numStations = fileScanner.nextInt();

      for(i = 0; i < TWO; i++) {
         enter[i] = fileScanner.nextInt();
      }

      for(i = 0; i < TWO; i++) {
         exit[i] = fileScanner.nextInt();
      }

      stations = new int[TWO][numStations];
      transfers = new int[TWO][numStations - 1];

      for(i = 0; i < TWO; i++) {
         for(j = 0; j < numStations; j++) {
            stations[i][j] = fileScanner.nextInt();
         }
      }

      for(i = 0; i < TWO; i++) {
         for(j = 0; j < numStations - 1; j++) {
            transfers[i][j] = fileScanner.nextInt();
         }
      }
/*
      System.out.println("\nNumber of Stations: " + numStations);
      System.out.println("\nCost of Entry to S #1: " + enter[0]);
      System.out.println("Cost of Entry to S #2: " + enter[1]);
      System.out.println("Cost of Exit from S #1: " + exit[0]);
      System.out.println("Cost of Exit from S #2: " + exit[1]);
      System.out.print("\nStation 1: [ ");
      for(i = 0; i < numStations; i++) {
         System.out.print(stations[0][i] + " ");
      }
      System.out.println("]");
      System.out.print("Station 2: [ ");
      for(i = 0; i < numStations; i++) {
         System.out.print(stations[1][i] + " ");
      }
      System.out.println("]");
      System.out.print("\nTransfer 1: [ ");
      for(i = 0; i < numStations - 1; i++) {
         System.out.print(transfers[0][i] + " ");
      }
      System.out.println("]");
      System.out.print("Transfer 2: [ ");
      for(i = 0; i < numStations - 1; i++) {
         System.out.print(transfers[1][i] + " ");
      }
      System.out.println("]");
*/
      System.out.println("Running Algorithm...");

      try {
         Thread.sleep(2000);
      } catch (InterruptedException e) {
           e.printStackTrace();
      }

      System.out.println(scheduler(stations, transfers, enter, exit, numStations));
   }

   public static int scheduler(int[][] stations, int[][] transfers, int[] enters, int[] exits, int numStations) {
      int line1[] = new int[numStations];
      int line2[] = new int[numStations];

      line1[0] = exits[0] + stations[0][0];

      line2[0] = exits[1] + stations[1][0];

      System.out.println("\n\nPrint Statements\nexit[0]: " + exits[0]);
      System.out.println("station[0][0]: " + stations[0][0]);
      System.out.println("line 1[0]: " + line1[0]);
      System.out.println("exit[1]: " + exits[1]);
      System.out.println("station[1][0]: " + stations[1][0]);
      System.out.println("line2[0]: " + line2[0]);
      System.out.println("exit[0]: " + exits[0]);
      System.out.println("exit[1]: " + exits[1]);
      System.out.println("station[0][1]: " + stations[0][1]);

      for(int i = 1; i < numStations; ++i) {
         System.out.println("\n\ni: " + i);
         System.out.println("stations[0][" + i + "]: " + stations[0][i]);
         System.out.println("line1[" + i + "]: " + line1[i]);
         System.out.println("stations[" + i + "][0]: " + stations[i][0]);
         System.out.println("line2[" + i + "]: " + line2[i]);
         line1[i] = min(line1[i - 1] + stations[0][i], line2[i - 1] + transfers[1][i] + stations[0][i]);
         line2[i] = min(line2[i - 1] + stations[1][i], line1[i - 1] + transfers[0][i] + stations[1][i]);
      }

      return min(line1[numStations - 1] + exits[0], line2[numStations - 1] + exits[1]);
   }

   public static int min(int a, int b) {
      if(a < b)
         return a;

      return b;
   }
}
