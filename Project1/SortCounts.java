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

 public class SortCounts
 {

   public static void main (String[] args)
   {

     Sorts1 sort = new Sorts1();
     Random rand = new Random();

     System.out.println("Average number of element-comparisons in three sorting algorithms:\n");

     for (int i = 100; i <= 12800; i = i * 2) {

       int[] ssAverages = new int[100];
       int[] msAverages = new int[100];
       int[] qsAverages = new int[100];

       // Run algorithm 100 times per list length
       for (int k = 0; k < 100; k++) {

         int[] list1 = new int[i];
         int[] list2 = new int[i];
         int[] list3 = new int[i];

         // initialize array with random integers and copy into other arrays
         for (int j = 0; j < list1.length; j++) {

           list1[j] = rand.nextInt(i);
           list2[j] = list1[j];
           list3[j] = list1[j];

         }

         // Store averages into array
         ssAverages[k] = sort.selectionSort(list1, i);
         msAverages[k] = sort.mergeSort(list2, i);
         qsAverages[k] = sort.quickSort(list3, i);

       }

       System.out.println("N=" + i + ": C_ss=" + avgs(ssAverages) +
                          ", C_ms=" + avgs(msAverages) +
                          ", C_qs=" + avgs(qsAverages));
     }

     System.out.println("\nEnd of output");
   }

   public static long avgs(int[] arr) {

     long sum = 0;
     for (int i : arr)
      sum = sum + i;

     return sum/arr.length;
   }
 }
