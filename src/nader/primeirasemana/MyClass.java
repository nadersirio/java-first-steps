package nader.primeirasemana;
public class MyClass {
  public static void main (String [] args) {
    System.out.println("My name is Náder");
    System.out.println("I'm 21 years old");

    final String BR = "Brazil"; // "Final" é a forma de criar uma variável const.
    System.out.println("I'm Living on " + BR);

    String firstName = "Náder";
    String secondName = "Wilk Silva Sírio";
    String allName = name (firstName, secondName);

    System.out.println(allName);
  }

  public static String name (String firstName, String secondName) {
    return firstName.concat(" ").concat(secondName);
  }

  public class DataTypes {
    public static void main(String[] args) {
      byte age = 123;
      short year = 2024;
      int cep = 21000000; // Se o dado começar com o n° 0, deve-se utilizar outro type.
      long cpf = 00000000000L; // Deve terminar com L. Se o dado começar com o n° 0, deve-se utilizar outro type.
      float pi = 3.14F; // Type Float deve-se terminar em F.
      double cash = 1275.33;
    }
  }
}
