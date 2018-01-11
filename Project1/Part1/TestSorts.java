public class TestSorts
{
  public static void main (String[] args)
  {
    Sorts sort = new Sorts();
    testSelectionSort(sort);
    testMergeSort(sort);
  }

  public static void testSelectionSort(Sorts sort)
  {
    int[] arr1 = {5, 4, 3, 2, 1};
    int[] arr2 = {1, 2, 3, 4, 5};
    int[] arr3 = {9, 5, -3, 0, 10};

    System.out.println("\n***** Selection Sort Tests *****");
    System.out.println("Test 1:");
    printArr(arr1);
    sort.selectionSort(arr1, 5);
    printArr(arr1);

    System.out.println("\nTest 2:");
    printArr(arr2);
    sort.selectionSort(arr2, 5);
    printArr(arr2);

    System.out.println("\nTest 3:");
    printArr(arr3);
    sort.selectionSort(arr3, 5);
    printArr(arr3);
  }

  public static void testMergeSort(Sorts sort)
  {
    int[] arr1 = {5, 4, 3, 2, 1};
    int[] arr2 = {3, 2, 4, 1};
    int[] arr3 = {9, 5, -3, 0, 10};
    int[] arr4 = {1, -1};
    int[] arr5 = {0, 1, -1};

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
  }

  public static void printArr(int[] arr)
  {
    for (int i : arr)
      System.out.print(i + " ");
    System.out.println();
  }
}
