public class MyClass {
  public static void main (String [] args) {
    System.out.println("Me chamo Náder");
    System.out.println("Tenho 21 anos");

    final String BR = "Brasil";
    System.out.println("E eu moro no " + BR);

    String firstName = "Náder";
    String secondName = "Wilk Silva Sírio";
    String allName = name (firstName, secondName);

    System.out.println(allName);
  }

  public static String name (String firstName, String secondName) {
    return firstName.concat(" ").concat(secondName);
  }
}
