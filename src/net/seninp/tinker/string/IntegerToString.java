package net.seninp.tinker.string;

public class IntegerToString {

  private static final int num = 4568;

  private static final char[] alphabet = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

  public static void main(String[] args) {

    System.out.println(Integer.valueOf(num).toString() + "\nor\n");

    StringBuffer sb = new StringBuffer();

    int value = num;
    while (value > 0) {

      int rem = value % 10;
      sb.append(alphabet[rem]);

      value = value / 10;
    }

    char[] res = new char[sb.length()];
    for (int i = sb.length() - 1; i > -1; i--) {
      res[sb.length() - i - 1] = sb.charAt(i);
    }

    System.out.println(String.valueOf(res));

  }
}
