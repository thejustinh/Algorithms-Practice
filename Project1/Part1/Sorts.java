/*****
 * Written By:
 * Justin Herrera
 * Juan Ramirez
 **/

public class Sorts
{
  /**
   * Sorts the list of N elements contained in arr[0..N-1] using the selection
   * sort algorithm
   **/
  public static void selectionSort (int[] arr, int N) {

    int temp, minI;

    for (int i = 0; i < N; i++) {

      minI = i;

      for (int j = i; j < N; j++) {

        if (arr[minI] > arr[j])
          minI = j;

      }

      temp = arr[i];
      arr[i] = arr[minI];
      arr[minI] = temp;

    }
  }

  /**
   * Sorts the list of N elements contained in arr[0..N-1] using the merge sort
   * algorithm
   **/
  public static void mergeSort (int[] arr, int N) {

    mergesort(arr, 0, N-1);

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
  private static void mergeSortedHalves (int[] arr, int left, int middle, int right) {

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
}
