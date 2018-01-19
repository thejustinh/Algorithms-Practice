/**
 * Written by:
 * Justin Herrera
 * jherre34@calpoly.edu
 * Juan Ramirez
 * jramir94@calpoly.edu
 * Project 1
 * Friday, January 19th, 2018
 */

import java.util.Random;

public class SortTimes {

  public static void main (String[] args) {

    Sorts sort = new Sorts();
    Random rand = new Random();

    System.out.println("Running Times of three sorting algorithms:\n");

    for (int i = 5000; i <= 160000; i = i * 2) {

      for (int j = 0; j < 5; j++) {
        
        int[] listcopy1 = new int[i];
        int[] listcopy2 = new int[i];
        int[] listcopy3 = new int[i];

        long selectTime, mergeTime, quickTime, start, end;

        for (int k = 0; k < listcopy1.length; k++) {

          listcopy1[k] = rand.nextInt(160000);
          listcopy2[k] = listcopy1[k];
          listcopy3[k] = listcopy1[k];

        }

        start = System.nanoTime();
        sort.selectionSort(listcopy1, i);
        end = System.nanoTime();
        selectTime = (end - start) / 1000000;

        start = System.nanoTime();
        sort.mergeSort(listcopy2, i);
        end = System.nanoTime();
        mergeTime = (end - start) / 1000000;

        start = System.nanoTime();
        sort.quickSort(listcopy3, i);
        end = System.nanoTime();
        quickTime = (end - start) / 1000000;

        System.out.println("N=" + i + ": T_ss=" + selectTime + ", T_ms=" +
                            mergeTime + ", T_qs=" + quickTime);

      }

      System.out.println();
    }

    System.out.println("End of output");
  }
}
