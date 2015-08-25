package net.seninp.tinker.arrays;

import java.util.HashMap;

public class Sum10 {

  private static final int[] array = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53,
      59, 61, 67, 71, 73, 79, 83, 89, 97 };

  public static void main(String[] args) {

    printSum(array, 10);

  }

  private static void printSum(int[] arr, int sum) {

    if (1 > arr.length) {
      return;
    }

    HashMap<Integer, Integer> seenElements = new HashMap<Integer, Integer>();

    for (int i = 0; i < arr.length; i++) {
      if (seenElements.containsKey(arr[i])) {
        System.out.println("Makes " + sum + ": " + arr[i] + " + " + arr[seenElements.get(arr[i])]);
      }
      else {
        seenElements.put(sum - arr[i], i);
      }
    }
  }

}
