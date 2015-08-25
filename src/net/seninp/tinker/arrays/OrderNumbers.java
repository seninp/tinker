package net.seninp.tinker.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class OrderNumbers {

  private static int[] arr = { 1, 2, 3, 2, 1, 1, 2, 2, 2, 3, 2, 3 };

  public static void main(String[] args) {

    System.out.println(Arrays.toString(arr));

    HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();

    for (int i = 0; i < arr.length; i++) {
      if (counts.containsKey(arr[i])) {
        counts.put(arr[i], counts.get(arr[i]) + 1);
      }
      else {
        counts.put(arr[i], 1);
      }
    }

    int[] res = new int[arr.length];
    int counter = 0;
    for (Entry<Integer, Integer> e : counts.entrySet()) {
      for (int i = 0; i < e.getValue(); i++) {
        res[counter + i] = e.getKey();
      }
      counter = counter + e.getValue();
    }

    System.out.println(Arrays.toString(res));
  }
}
