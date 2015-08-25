package net.seninp.tinker.bits;

public class BitTinker {

  private final static char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a',
      'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
      't', 'u', 'v', 'w', 'x', 'y', 'z' };

  private static final String CR = ".\n";

  private static int value1 = 9;

  private static int bitmask = 0x000F;
  private static int value2 = 0x2222;

  public static void main(String[] args) {

    System.out.println("We are working with an integer " + value1 + " which in binary is "
        + toBinaryString(value1) + CR);

    System.out.println("Shifting left by 1: " + toBinaryString(value1 << 1)
        + ", is like multiplying by 2: " + toBinaryString(value1 * 2) + CR);

    System.out.println("Shifting right by 1: " + toBinaryString(value1 >> 1)
        + ", is like dividing by 2: " + toBinaryString(value1 / 2) + CR);

    System.out.println("Value " + toBinaryString(value2) + " AND bitmask "
        + toBinaryString(bitmask) + " equals " + toBinaryString(value2 & 2) + " or "
        + Integer.toString(value2 & 2) + CR);

    System.out.println("Value " + toBinaryString(value2) + " XOR bitmask "
        + toBinaryString(bitmask) + " equals " + toBinaryString(value2 ^ 2) + " or "
        + Integer.toString(value2 ^ 2) + CR);

  }

  private static String toBinaryString(int i) {

    int radix = 2;

    char buf[] = new char[33];
    boolean negative = (i < 0);
    int charPos = 32;

    if (!negative) {
      i = -i;
    }

    while (i <= -radix) {
      buf[charPos--] = digits[-(i % radix)];
      i = i / radix;
    }
    buf[charPos] = digits[-i];

    if (negative) {
      buf[--charPos] = '-';
    }

    return new String(buf, charPos, (33 - charPos));

  }

}
