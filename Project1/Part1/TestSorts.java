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

    System.out.println("\n***** Selection Sort Tests *****");
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
    sort.selectionSort(arr6, 3);
    printArr(arr6);

    System.out.println("\nTest 7:");
    printArr(arr7);
    sort.selectionSort(arr7, 4);
    printArr(arr7);

    System.out.println("\nTest 8:");
    printArr(arr8);
    sort.selectionSort(arr8, 1);
    printArr(arr8);
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
    sort.mergeSort(arr6, 3);
    printArr(arr6);

    System.out.println("\nTest 7:");
    printArr(arr7);
    sort.mergeSort(arr7, 4);
    printArr(arr7);

    System.out.println("\nTest 8:");
    printArr(arr8);
    sort.mergeSort(arr8, 1);
    printArr(arr8);
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
    sort.quickSort(arr6, 3);
    printArr(arr6);

    System.out.println("\nTest 7:");
    printArr(arr7);
    sort.quickSort(arr7, 4);
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
  }

  public static void printArr(int[] arr)
  {
    for (int i : arr)
      System.out.print(i + " ");
    System.out.println();
  }

}
