package net.seninp.tinker.arrays;

import java.util.Arrays;

public class MergeSortVariant {

  private static final int[] arr = { 3, 2, 55, 7, 123, 123, 1 };

  public static void main(String[] args) {

    System.out.println(Arrays.toString(arr));
    mergesort(arr, 0, arr.length);
    System.out.println(Arrays.toString(arr));

  }

  private static void mergesort(int[] arr, int l, int h) {
    if (h - l > 1) {
      int q = l + (int) Math.floor((h - l) / 2);
      mergesort(arr, l, q);
      mergesort(arr, q, h);
      merge(arr, l, q, h);
    }
  }

  private static void merge(int[] arr, int l, int q, int h) {

    int[] low = Arrays.copyOfRange(arr, l, q);
    int[] high = Arrays.copyOfRange(arr, q, h);
    System.out.println("merging " + Arrays.toString(low) + " and " + Arrays.toString(high)
        + ", arr " + Arrays.toString(arr));

    int k = l, i = 0, j = 0;
    while (i < low.length && j < high.length) {
      if (low[i] < high[j]) {
        arr[k] = low[i];
        i++;
        k++;
      }
      else {
        arr[k] = high[j];
        j++;
        k++;
      }
    }

    while (i < low.length) {
      arr[k] = low[i];
      i++;
      k++;
    }

    while (j < high.length) {
      arr[k] = high[j];
      j++;
      k++;
    }
  }

}
