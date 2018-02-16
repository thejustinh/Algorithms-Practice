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

public class FactoryProblem {
   public static final int TWO = 2;

   public static void main(String[] args) throws FileNotFoundException {
      int numStations, i, j;
      int[] enter = new int[TWO];
      int[] exit = new int[TWO];
      int[][] stations, transfers, lines;
      File file;
      Scanner scanner = new Scanner(System.in);
      Scanner fileScanner;

      System.out.print("Enter name of file: ");
      file = new File(scanner.nextLine());
      System.out.println("File selected: " + file);
      fileScanner = new Scanner(file);

      numStations = fileScanner.nextInt();

      inputEnEx(enter, exit, fileScanner);

      stations = new int[TWO][numStations];
      transfers = new int[TWO][numStations - 1];

      inputStTr(stations, transfers, fileScanner, numStations);

      System.out.println(scheduler(stations, transfers, enter, exit, numStations));
   }

   public static void inputEnEx(int[] enter, int[] exit, Scanner s) {
      int i;

      for(i = 0; i < TWO; i++) {
         enter[i] = s.nextInt();
      }

      for(i = 0; i < TWO; i++) {
         exit[i] = s.nextInt();
      }
   }

   public static void inputStTr(int[][] stations, int[][] transfers, Scanner s, int numStations) {
      int i, j;

      for(i = 0; i < TWO; i++) {
         for(j = 0; j < numStations; j++) {
            stations[i][j] = s.nextInt();
         }
      }

      for(i = 0; i < TWO; i++) {
         for(j = 0; j < numStations - 1; j++) {
            transfers[i][j] = s.nextInt();
         }
      }
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

      for(int i = 1; i < numStations + 1; ++i) {
         System.out.println("\n\ni: " + i);
         System.out.println("stations[0][" + i + "]: " + stations[0][i]);
         System.out.println("stations[" + i + "][0]: " + stations[i][0]);
         System.out.println("line1[" + i + "]: " + line1[i]);
         System.out.println("stations[" + i + "][0]: " + stations[i][0]);
         System.out.println("line2[" + i + "]: " + line2[i]);
         line1[i] = min(line1[i - 1] + stations[0][i], line2[i - 1] + transfers[1][i] + stations[0][i]);
         line2[i] = min(line2[i - 1] + stations[1][i], line1[i - 1] + transfers[0][i] + stations[1][i]);
      }

      return min(line1[numStations - 1] + exits[0], line2[numStations - 1] + exits[1]);
   }

   public static void printSolution(int[][] lines, int numStations) {
      int i = lines[0][0];

      System.out.println("The optimal route is:\n");
      
   }

   public static int min(int a, int b) {
      if(a < b)
         return a;

      return b;
   }
}
