package net.seninp.tinker.algorithms;

import java.util.Arrays;

public class BooyerMoore {

  private final static char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
      'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

  private static String str = "findingahaystackneedleina";

  private static String pattern = "needle";

  public static void main(String[] args) {

    int R = letters.length;
    int[] right = new int[R];
    for (int i = 0; i < R; i++) {
      right[i] = -1;
    }
    for (int i = 0; i < pattern.length(); i++) {
      right[pattern.charAt(i) - 96] = i;
    }

    System.out.println(Arrays.toString(right));

    int N = str.length();
    int M = pattern.length();
    int skip;
    for (int i = 0; i < N - M; i += skip) {
      skip = 0;
      for (int j = M - 1; j >= 0; j--) {
        if (pattern.charAt(j) != str.charAt(i + j)) {
          skip = Math.max(1, right[pattern.charAt(i + j) - 96]);
          break;
        }
      }
      if (skip == 0) {
        System.out.println("Mathch found at " + i);
        System.exit(10);
      }
    }

    System.out.println("Match was not found!");

  }
}
