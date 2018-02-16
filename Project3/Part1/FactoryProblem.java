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

      scheduler(stations, transfers, enter, exit, numStations);
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

   public static void scheduler(int[][] stations, int[][] transfers, int[] enters, int[] exits, int numStations) {
      int[] line1 = new int[numStations];
      int[] line2 = new int[numStations];
      int[] bestRoute = new int[numStations];
      int i;

      line1[0] = enters[0] + stations[0][0];
      line2[0] = enters[1] + stations[1][0];



      for(i = 1; i < numStations; i++) {
         line1[i] = min(line1[i - 1] + stations[0][i], line2[i - 1] + transfers[1][i - 1] + stations[0][i]);
         if(line1[i - 1] + stations[0][i] <= line2[i - 1] + transfers[1][i - 1] + stations[0][i]) 
            bestRoute[i] = 1;
         else
            bestRoute[i] = 2;
         line2[i] = min(line2[i - 1] + stations[1][i], line1[i - 1] + transfers[0][i - 1] + stations[1][i]);

         if(line2[i - 1] + stations[1][i] <= line1[i - 1] + transfers[0][i - 1] + stations[1][i])
            bestRoute[i] = 2;
         else
            bestRoute[i] = 1;

      }

      if(line1[numStations - 1] + exits[0] <= line2[numStations - 1] + exits[1]) {
         bestRoute[0] = 1;
      }
      else
         bestRoute[0] = 2;

      System.out.print("\nFastest time is: " +  min(line1[numStations - 1] + exits[0], line2[numStations - 1] + exits[1]) + "\n\n");

      System.out.println("The optimal route is: ");
      for(i = 0; i < numStations; i++) {
         System.out.println("Station " + (i+1) +", line " + bestRoute[i]);
      }
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
