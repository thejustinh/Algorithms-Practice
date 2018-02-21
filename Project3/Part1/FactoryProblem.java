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


      System.out.print("Enter name of file: ");
      file = new File(scanner.nextLine());

      try {
        
        fileScanner = new Scanner(file);

        // line 1
        int numStations = fileScanner.nextInt();

        // line 2
        int e1 = fileScanner.nextInt();
        int e2 = fileScanner.nextInt();

        // line 3
        int x1 = fileScanner.nextInt();
        int x2 = fileScanner.nextInt();

        // line 4 / 5
        int[][] a = new int[TWO][numStations];
        for (int i = 0; i < TWO; i++) {
          for (int j = 0; j < numStations; j++) {
            a[i][j] = fileScanner.nextInt();
          }
        }

        // line 6 / 7
        int[][] t = new int[TWO][numStations - 1];
        for(int i = 0; i < TWO; i++) {
           for(int j = 0; j < numStations - 1; j++) {
              t[i][j] = fileScanner.nextInt();
           }
        }

        scheduler(a, t, e1, e2, x1, x2, numStations);

      } catch (Exception e) {

        e.printStackTrace();

      }
   }

   public static void scheduler(int[][] a, int[][] t, int e1, int e2, int x1, int x2, int numStations) {

     int[][] T = new int[TWO][numStations];
     int[][] L = new int[TWO][numStations];
     int[] route = new int[numStations];
     int line;

     T[0][0] = e1 + a[0][0];
     T[1][0] = e2 + a[1][0];

     for (int i = 1; i < numStations; i++) {

        T[0][i] = min(T[0][i - 1] + a[0][i], T[1][i - 1] + t[1][i - 1] + a[0][i]);
        if (T[0][i - 1] + a[0][i] <= T[1][i - 1] + t[1][i - 1] + a[0][i])
           L[0][i - 1] = 1;
        else
           L[0][i - 1] = 2;

        T[1][i] = min(T[1][i - 1] + a[1][i], T[0][i - 1] + t[0][i - 1] + a[1][i]);
        if (T[1][i - 1] + a[1][i] <= T[0][i - 1] + t[0][i - 1] + a[1][i])
           L[1][i - 1] = 2;
        else
           L[1][i - 1] = 1;

     }

     if (T[0][numStations - 1] + x1 <= T[1][numStations - 1] + x2) {
        L[0][numStations - 1] = 1;
        line = 0;
        System.out.print("\nFastest time is: " + (min(T[0][numStations - 1] + x1, T[1][numStations - 1] + x2)) + "\n\n");
     } else {
        L[1][numStations - 1] = 2;
        System.out.print("\nFastest time is: " + (min(T[0][numStations - 1] + x1, T[1][numStations - 1] + x2)) + "\n\n");
        line = 1;
     }

     // build path
     for (int i = numStations - 1; i >= 0; i--) {
        route[i] = L[line][i];
        if (L[line][i] == 1)
          line = 0;
        if (L[line][i] == 2)
          line = 1;
     }

     for (int i = 0; i < numStations; i++) {
        System.out.println("station " + (i + 1) + ", line " + route[i]);
     }

   }

   public static int min(int a, int b) {

      if (a < b)

         return a;

      return b;

   }
}
