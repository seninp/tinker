package net.seninp.tinker.java;

public class PassByValue {

  //
  // http://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value
  //

  public static void main(String[] args) {

    Dog aDog = new Dog("Max");
    foo(aDog);

    if (aDog.getName().equals("Max")) { // true
      System.out.println("Java passes by value.");

    }
    else if (aDog.getName().equals("Fifi")) {
      System.out.println("Java passes by reference.");
    }

  }

  public static void foo(Dog d) {

    d.getName().equals("Max"); // true

    d = new Dog("Fifi");
    d.getName().equals("Fifi"); // true

  }

  public static class Dog {

    private String name;

    public Dog(String string) {
      this.name = string;
    }

    public Object getName() {
      return this.name;
    }

  }

}
