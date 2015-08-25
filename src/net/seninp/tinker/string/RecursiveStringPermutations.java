package net.seninp.tinker.string;

public class RecursiveStringPermutations {

  private static final String str = "abc";

  public static void main(String[] args) {

    System.out.println("Permuting a string \"" + str + "\"");

    permutation("", str);

  }

  private static void permutation(String prefix, String s) {
    int len = s.length();
    if (len == 0) {
      System.out.println(prefix);
    }
    else {
      for (int i = 0; i < len; i++) {
        permutation(prefix + s.charAt(i), s.substring(0, i) + s.substring(i + 1, len));
      }
    }

  }
}
