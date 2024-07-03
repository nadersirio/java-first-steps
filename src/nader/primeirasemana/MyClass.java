package nader.primeirasemana;
public class MyClass {
  public static void main (String [] args) {
    System.out.println("My name is Náder");
    System.out.println("I'm 21 years old");

    final String BR = "Brazil";
    System.out.println("I'm Living on " + BR);

    String firstName = "Náder";
    String secondName = "Wilk Silva Sírio";
    String allName = name (firstName, secondName);

    System.out.println(allName);
  }

  public static String name (String firstName, String secondName) {
    return firstName.concat(" ").concat(secondName);
  }
}
