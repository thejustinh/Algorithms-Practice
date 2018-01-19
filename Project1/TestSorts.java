/**
 * Written by:
 * Justin Herrera
 * Juan Ramirez
 * jherre34@calpoly.edu
 * jramir94@calpoly.edu
 * Project 1
 * Friday, January 19th, 2018
 */

import java.util.Random;

public class TestSorts
{
  public static void main (String[] args)
  {
    Sorts sort = new Sorts();
    testSelectionSort(sort);
    testMergeSort(sort);
    testQuickSort(sort);
  }

  public static void testSelectionSort(Sorts sort)
  {
    int[] arr1 = {5, 4, 3, 2, 1};
    int[] arr2 = {3, 2, 4, 1};
    int[] arr3 = {9, 5, -3, 0, 10};
    int[] arr4 = {1, -1};
    int[] arr5 = {0, 1, -1};
    int[] arr6 = new int[10];
    arr6[0] = 4;
    arr6[1] = -2;
    arr6[2] = 0;
    int[] arr7 = new int[10];
    arr7[0] = 3;
    arr7[1] = 7;
    arr7[2] = -1;
    arr7[3] = 5;
    int[] arr8 = new int[1];
    arr8[0] = 7;
    int[] arr9 = new int[10];
    Random rand = new Random();
    for(int i = 0; i < 10; i++) {
       arr9[i] = rand.nextInt(25000);
    }
    int[] arr10 = new int[11];
    for(int i = 0; i < 11; i++) {
       arr10[i] = rand.nextInt(13131) * -1 + 1750;
    }
    int[] arr11 = {};
    int[] arr12 = {7,7,7,7,7,7,7};
//    int[] arr13 = {};
//    int[] arr14 = {};
//    int[] arr15 = {};

    System.out.println("***** Selection Sort Tests *****");
    System.out.println("Test 1:");
    printArr(arr1);
    sort.selectionSort(arr1, 5);
    printArr(arr1);

    System.out.println("\nTest 2:");
    printArr(arr2);
    sort.selectionSort(arr2, 4);
    printArr(arr2);

    System.out.println("\nTest 3:");
    printArr(arr3);
    sort.selectionSort(arr3, 5);
    printArr(arr3);

    System.out.println("\nTest 4:");
    printArr(arr4);
    sort.selectionSort(arr4, 2);
    printArr(arr4);

    System.out.println("\nTest 5:");
    printArr(arr5);
    sort.selectionSort(arr5, 3);
    printArr(arr5);

    System.out.println("\nTest 6:");
    printArr(arr6);
    sort.selectionSort(arr6, 10);
    printArr(arr6);

    System.out.println("\nTest 7:");
    printArr(arr7);
    sort.selectionSort(arr7, 10);
    printArr(arr7);

    System.out.println("\nTest 8:");
    printArr(arr8);
    sort.selectionSort(arr8, 1);
    printArr(arr8);

    System.out.println("\nTest 9:");
    printArr(arr9);
    sort.selectionSort(arr9, 10);
    printArr(arr9);

    System.out.println("\nTest 10:");
    printArr(arr10);
    sort.selectionSort(arr10, 11);
    printArr(arr10);

    System.out.println("\nTest 11:");
    printArr(arr11);
    sort.selectionSort(arr10, 0);
    printArr(arr11);

    System.out.println("\nTest 12:");
    printArr(arr12);
    sort.selectionSort(arr12, 7);
    printArr(arr12);
  }

  public static void testMergeSort(Sorts sort)
  {
    int[] arr1 = {5, 4, 3, 2, 1};
    int[] arr2 = {3, 2, 4, 1};
    int[] arr3 = {9, 5, -3, 0, 10};
    int[] arr4 = {1, -1};
    int[] arr5 = {0, 1, -1};
    int[] arr6 = new int[10];
    arr6[0] = 4;
    arr6[1] = -2;
    arr6[2] = 0;
    int[] arr7 = new int[10];
    arr7[0] = 3;
    arr7[1] = 7;
    arr7[2] = -1;
    arr7[3] = 5;
    int[] arr8 = new int[1];
    arr8[0] = 7;
    int[] arr9 = new int[10];
    Random rand = new Random();
    for(int i = 0; i < 10; i++) {
       arr9[i] = rand.nextInt(25000);
    }
    int[] arr10 = new int[11];
    for(int i = 0; i < 11; i++) {
       arr10[i] = rand.nextInt(13131) * -1 + 1750;
    }
    int[] arr11 = {};
    int[] arr12 = {7,7,7,7,7,7,7};

    System.out.println("\n***** Merge Sort Tests *****");
    System.out.println("Test 1:");
    printArr(arr1);
    sort.mergeSort(arr1, 5);
    printArr(arr1);

    System.out.println("\nTest 2:");
    printArr(arr2);
    sort.mergeSort(arr2, 4);
    printArr(arr2);

    System.out.println("\nTest 3:");
    printArr(arr3);
    sort.mergeSort(arr3, 5);
    printArr(arr3);

    System.out.println("\nTest 4:");
    printArr(arr4);
    sort.mergeSort(arr4, 2);
    printArr(arr4);

    System.out.println("\nTest 5:");
    printArr(arr5);
    sort.mergeSort(arr5, 3);
    printArr(arr5);

    System.out.println("\nTest 6:");
    printArr(arr6);
    sort.mergeSort(arr6, 10);
    printArr(arr6);

    System.out.println("\nTest 7:");
    printArr(arr7);
    sort.mergeSort(arr7, 10);
    printArr(arr7);

    System.out.println("\nTest 8:");
    printArr(arr8);
    sort.mergeSort(arr8, 1);
    printArr(arr8);

    System.out.println("\nTest 9:");
    printArr(arr9);
    sort.mergeSort(arr9, 10);
    printArr(arr9);

    System.out.println("\nTest 10:");
    printArr(arr10);
    sort.mergeSort(arr10, 11);
    printArr(arr10);

    System.out.println("\nTest 11:");
    printArr(arr11);
    sort.mergeSort(arr11, 0);
    printArr(arr11);

    System.out.println("\nTest 12:");
    printArr(arr12);
    sort.mergeSort(arr12, 7);
    printArr(arr12);
  }

  public static void testQuickSort(Sorts sort)
  {
    int[] arr1 = {5, 4, 3, 2, 1};
    int[] arr2 = {3, 2, 4, 1};
    int[] arr3 = {9, 5, -3, 0, 10};
    int[] arr4 = {1, -1};
    int[] arr5 = {0, 1, -1};
    int[] arr6 = new int[10];
    arr6[0] = 4;
    arr6[1] = -2;
    arr6[2] = 0;
    int[] arr7 = new int[10];
    arr7[0] = 4;
    arr7[1] = 3;
    arr7[2] = 2;
    arr7[3] = 1;
    int[] arr8 = new int[1];
    arr8[0] = 7;
    int[] arr9 = {5, 4, 2, 1, 3};
    int[] arr10 = {9, 8, 7};
    int[] arr11 = new int[10];
    Random rand = new Random();
    for(int i = 0; i < 10; i++) {
       arr11[i] = rand.nextInt(25000);
    }
    int[] arr12 = new int[11];
    for(int i = 0; i < 11; i++) {
       arr12[i] = rand.nextInt(13131) * -1 + 1750;
    }
    int[] arr13 = {};
    int[] arr14 = {7,7,7,7,7,7,7};

    System.out.println("\n***** Quick Sort Tests *****");
    System.out.println("Test 1:");
    printArr(arr1);
    sort.quickSort(arr1, 5);
    printArr(arr1);

    System.out.println("\nTest 2:");
    printArr(arr2);
    sort.quickSort(arr2, 4);
    printArr(arr2);

    System.out.println("\nTest 3:");
    printArr(arr3);
    sort.quickSort(arr3, 5);
    printArr(arr3);

    System.out.println("\nTest 4:");
    printArr(arr4);
    sort.quickSort(arr4, 2);
    printArr(arr4);

    System.out.println("\nTest 5:");
    printArr(arr5);
    sort.quickSort(arr5, 3);
    printArr(arr5);

    System.out.println("\nTest 6:");
    printArr(arr6);
    sort.quickSort(arr6, 10);
    printArr(arr6);

    System.out.println("\nTest 7:");
    printArr(arr7);
    sort.quickSort(arr7, 10);
    printArr(arr7);

    System.out.println("\nTest 8:");
    printArr(arr8);
    sort.quickSort(arr8, 1);
    printArr(arr8);

    System.out.println("\nTest 9:");
    printArr(arr9);
    sort.quickSort(arr9, 5);
    printArr(arr9);

    System.out.println("\nTest 10:");
    printArr(arr10);
    sort.quickSort(arr10, 3);
    printArr(arr10);

    System.out.println("\nTest 11:");
    printArr(arr11);
    sort.quickSort(arr11, 10);
    printArr(arr11);

    System.out.println("\nTest 12:");
    printArr(arr12);
    sort.quickSort(arr12, 11);
    printArr(arr12);

    System.out.println("\nTest 13:");
    printArr(arr13);
    sort.quickSort(arr13, 0);
    printArr(arr13);

    System.out.println("\nTest 14:");
    printArr(arr14);
    sort.quickSort(arr14, 7);
    printArr(arr14);
  }

  public static void printArr(int[] arr)
  {
    for (int i : arr)
      System.out.print(i + " ");
    System.out.println();
  }

  public static boolean isSorted (int[] a) {

    for (int i = 0; i < a.length - 1; i++) {

      if (a[i] > a[i + 1])
        return false;

    }

    return true;

  }
}
