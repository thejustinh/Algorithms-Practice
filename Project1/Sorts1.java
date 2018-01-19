/**
 * Written by:
 * Justin Herrera
 * jherre34@calpoly.edu
 * Juan Ramirez
 * jramir94@calpoly.edu
 * Project 1
 * Friday, January 19th, 2018
 */

public class Sorts1
{

  private static int msCount = 0;
  private static int qsCount = 0;

  /**
   * Sorts the list of N elements contained in arr[0..N-1] using the selection
   * sort algorithm
   **/
  public static int selectionSort (int[] arr, int N) {

    int temp, minI;
    int count = 0;

    for (int i = 0; i < N; i++) {

      minI = i;

      for (int j = i; j < N; j++) {

        if (arr[minI] > arr[j]) {
          minI = j;
        }
        count++;

      }

      temp = arr[i];
      arr[i] = arr[minI];
      arr[minI] = temp;

    }

    return count;
  }

  /**
   * Sorts the list of N elements contained in arr[0..N-1] using the merge sort
   * algorithm
   **/
  public static int mergeSort (int[] arr, int N) {

    msCount = 0;

    mergesort(arr, 0, N-1);

    return msCount;
  }

  /**
   * This method sorts list[first..last] segment
   **/
  private static void mergesort (int[] list, int first, int last) {

    //checking if there is more than one element in list[first..last] segment
    if (first < last) {

      int middle = (first + last)/2;
      mergesort(list, first, middle);
      mergesort(list, middle + 1, last);

      //supporting method for merging two halves
      mergeSortedHalves (list, first, middle, last);

    }
  }

  /**
   * Merges two sorted halves of the array segment arr[left..right]
   * Precondition: arr[left..middle] is sorted; arr[(middle+1)..right] is sorted
   * Postcondition: arr[left..right] is sorted.
   **/
  private static void mergeSortedHalves (int[] arr, int left, int middle,
                                          int right) {

    int[] temp = new int[right - left + 1];
    int index1 = left;
    int index2 = middle + 1;
    int index = 0;

    while (index1 <= middle && index2 <= right) {

      if (arr[index1] < arr[index2]) {
        temp[index] = arr[index1];
        index1++;
      } else {
        temp[index] = arr[index2];
        index2++;
      }
      msCount++;
      index++;
    }

    while (index1 <= middle) {
      temp[index] = arr[index1];
      index++;
      index1++;
    }

    while (index2 <= right) {
      temp[index] = arr[index2];
      index++;
      index2++;
    }

    for (int i = left; i <= right; i++)
      arr[i] = temp[i - left];
  }

  /**
   * Sorts the list of N elements contained in arr[0..N-1] using the quick
   * sort algorithm with median-of-three pivot and rearrangement of the three
   * elements.
   **/
  public static int quickSort (int[] list, int N) {

    qsCount = 0;

    quickSort(list, 0, N-1);

    return qsCount;

  }

  /**
   * Sorts list[first..last] segment
   **/
  private static void quickSort (int[] list, int first, int last) {

    //checking if there is more than one element in list[first..last] segment
    if (first < last) {

      //supporting method
      setPivotToEnd(list, first, last);

      //supporting method
      int pivotIndex = splitList (list, first, last);
      quickSort(list, first, pivotIndex-1);
      quickSort(list, pivotIndex+1, last);

    }
  }

  /**
   * Chooses a pivot in arr[left..right] and place it at the end of the segment
   * Precondition: none
   * Postcondition: arr[right] is the pivot.
   **/
  private static void setPivotToEnd (int[] arr, int left, int right){

    int temp;
    int center = (left+right)/2;

    if (arr[center] < arr[left])
    {
      temp = arr[center];
      arr[center] = arr[left];
      arr[left] = temp;
    }

    if(arr[right] < arr[left])
    {
      temp = arr[right];
      arr[right] = arr[left];
      arr[left] = temp;
    }

    if(arr[center] < arr[right])
    {
      temp = arr[center];
      arr[center] = arr[right];
      arr[right] = temp;
    }

    qsCount = qsCount + 3;

  }

  /**
   * Rearranges the list by placing the pivot so that it is preceded by smaller
   * values and followed by greater values. Returns pivot’s index.
   * Precondition: arr[right] contains the pivot
   * Postcondition: the pivot is properly placed and its index is returned.
   * Elements in the list are arranged so that arr[i]<pivot for all arr[i]
   * located to the left of pivot, and arr[i]>pivot for all arr[i] located to
   * the right of the pivot.
   **/
  private static int splitList (int[] arr, int left, int right) {

    // starts with the first index of the segment and increments by 1
    int indexL = left;

    // starts with the second-to-last element, and gets decremented by 1
    int indexR = right - 1;
    int pivot = arr[right];

    // while the two indexes havent crossed over
    while (indexL <= indexR) {

      // increment indexL as long as it is smaller than the pivot
      while (arr[indexL] < pivot) {
        indexL++;
        qsCount++;
      }

      // decrement indexR as long as it has not crossed over and > pivot
      while (indexR >= indexL && arr[indexR] > pivot) {
        indexR--;
        qsCount++;
      }

      // If the two indexes didnt "cross over", swap arr[indexR] and arr[indexL]
      if (indexR >= indexL) {

        int temp = arr[indexR];
        arr[indexR] = arr[indexL];
        arr[indexL] = temp;
        indexL++;
        indexR--;

      }
    }

    int temp = arr[indexL];
    arr[indexL] = pivot;
    arr[right] = temp;
    return indexL;
  }

  public static void printArr(int[] arr)
  {
    for (int i : arr)
      System.out.print(i + " ");
    System.out.println();
  }
}
