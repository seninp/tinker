package net.seninp.tinker.arrays;

import java.util.Arrays;

public class MergeSort {

  private static int a[] = { 23, 44, 1, 2009, 2, 88, 123, 7, 999, 1040, 88 };

  public static void main(String[] args) {

    mergesort(a);
    System.out.println(Arrays.toString(a));

  }

  private static void mergesort(int[] arr) {
    if (arr.length > 1) {
      int q = (int) Math.floor(arr.length / 2);
      int[] leftArray = Arrays.copyOfRange(arr, 0, q);
      int[] rightArray = Arrays.copyOfRange(arr, q, arr.length);
      mergesort(leftArray);
      mergesort(rightArray);
      merge(arr, leftArray, rightArray);
    }

  }

  private static void merge(int[] arr, int[] leftArray, int[] rightArray) {

    int i = 0;
    int lI = 0;
    int rI = 0;

    // traverse and copy
    while (lI < leftArray.length && rI < rightArray.length) {
      if (leftArray[lI] < rightArray[rI]) {
        arr[i] = leftArray[lI];
        i++;
        lI++;
      }
      else {
        arr[i] = rightArray[rI];
        i++;
        rI++;
      }
    }

    // copy the rest
    while (lI < leftArray.length) {
      arr[i] = leftArray[lI];
      i++;
      lI++;
    }
    while (rI < rightArray.length) {
      arr[i] = rightArray[rI];
      i++;
      rI++;
    }
  }

}
