package net.seninp.tinker.arrays;

import java.util.Arrays;

public class InsertionSort {

  private static final int[] arr = { 3, 2, 55, 7, 123, 123, 1 };

  public static void main(String[] args) {

    System.out.println(Arrays.toString(arr));

    for (int i = 0; i < arr.length; i++) {
      int minIdx = findMin(arr, i, arr.length);
      swap(arr, i, minIdx);
    }

    System.out.println(Arrays.toString(arr));

  }

  private static void swap(int[] arr, int q, int p) {
    int tmp = arr[p];
    arr[p] = arr[q];
    arr[q] = tmp;
  }

  private static int findMin(int[] arr, int i, int length) {
    int minIdx = i;
    for (int j = i; j < length; j++) {
      if (arr[j] < arr[minIdx]) {
        minIdx = j;
      }
    }
    return minIdx;
  }

}
