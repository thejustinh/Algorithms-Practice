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
   public static void main(String[] args) throws FileNotFoundException {
      File file;
      Scanner scanner = new Scanner(System.in);
      Scanner fileScanner;
      int numStations, enter1, enter2, exit1, exit2, cnt1, cnt2, cnt3, cnt4, i = 0, j = 0;
      int[] station1, station2, transfer1, transfer2;

      System.out.print("Enter name of file: ");
      file = new File(scanner.nextLine());
      System.out.println("File selected: " + file);
      fileScanner = new Scanner(file);

      numStations = cnt1 = cnt2 = cnt3 = cnt4 = fileScanner.nextInt();
      enter1 = fileScanner.nextInt();
      enter2 = fileScanner.nextInt();
      exit1 = fileScanner.nextInt();
      exit2 = fileScanner.nextInt();
      
      station1 = new int[numStations];
      station2 = new int[numStations];
      transfer1 = new int[numStations - 1];
      transfer2 = new int[numStations - 1];

      while(cnt1 > 0) {
         station1[i++] = fileScanner.nextInt();
         cnt1--;
      }

      while(cnt2 > 0) {
         station2[j++] = fileScanner.nextInt();
         cnt2--;
      }

      i = j = 0;

      while(cnt3 > 1) {
         transfer1[i++] = fileScanner.nextInt();
         cnt3--;
      }

      while(cnt4 > 1) {
         transfer2[j++] = fileScanner.nextInt();
         cnt4--;
      }

      System.out.println("\nNumber of Stations: " + numStations);
      System.out.println("\nCost of Entry to S #1: " + enter1);
      System.out.println("Cost of Entry to S #2: " + enter2);
      System.out.println("Cost of Exit from S #1: " + exit1);
      System.out.println("Cost of Exit from S #2: " + exit2);
      System.out.print("\nStation 1: [ ");
      for(i = 0; i < numStations; i++) {
         System.out.print(station1[i] + " ");
      }
      System.out.println("]");
      System.out.print("Station 2: [ ");
      for(i = 0; i < numStations; i++) {
         System.out.print(station2[i] + " ");
      }
      System.out.println("]");
      System.out.print("\nTransfer 1: [ ");
      for(i = 0; i < numStations - 1; i++) {
         System.out.print(transfer1[i] + " ");
      }
      System.out.println("]");
      System.out.print("Transfer 2: [ ");
      for(i = 0; i < numStations - 1; i++) {
         System.out.print(transfer2[i] + " ");
      }
      System.out.println("]");
   }
}
