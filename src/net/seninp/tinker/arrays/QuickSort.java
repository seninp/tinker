package net.seninp.tinker.arrays;

import java.util.Arrays;

public class QuickSort {

  private static int a[] = { 23, 44, 1, 2009, 2, 88, 123, 7, 999, 1040, 88 };

  public static void main(String[] args) {

    quicksort(a, 0, a.length - 1);
    System.out.println(Arrays.toString(a));

  }

  private static void quicksort(int[] arr, int start, int end) {
    if (start < end) {
      int q = partition(arr, start, end);
      quicksort(a, start, q-1);
      quicksort(a, q + 1, end);
    }
  }

  private static int partition(int[] arr, int low, int high) {

    int p = high; // pivot
    int firsthigh = low; // divider for the pivot

    for (int i = low; i < high; i++) {
      if (arr[i] < arr[p]) {
        swap(arr, i, firsthigh);
        firsthigh++;
      }
    }
    swap(arr, p, firsthigh);
    return (firsthigh);
  }

  /**
   * Swaps array elements;
   * 
   * @param arr
   * @param l
   * @param h
   */
  private static void swap(int[] arr, int l, int h) {
    int tmp = arr[l];
    arr[l] = arr[h];
    arr[h] = tmp;
  }
}
