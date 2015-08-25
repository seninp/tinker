package net.seninp.tinker.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BinarySearch {

  private static final int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53,
      59, 61, 67, 71, 73, 79, 83, 89, 97 };

  public static void main(String[] args) throws IOException {

    System.out.println("Please enter the number :");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int target = 0;

    try {
      target = Integer.parseInt(br.readLine());
    }
    catch (NumberFormatException nfe) {
      System.err.println("Invalid Format!");
    }

    int min = 0;
    int max = primes.length - 1;

    int guessCounter = 0;
    while (min < max) {

      int guess = min + (int) Math.floor((max - min) / 2);

      if (target == primes[guess]) {
        System.out.println("found " + guess + " in " + guessCounter + " iterations.");
        System.exit(-10);
      }
      else {
        System.out.println("iteration " + guessCounter + " guess: " + primes[guess]);
      }

      if (target < primes[guess]) {
        max = guess - 1;
      }
      else {
        min = guess + 1;
      }

      guessCounter++;
    }

    System.out.println("The number " + target + " was not found among " + Arrays.toString(primes));

  }
}
