import java.util.Scanner;

public class ScientificCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Demande les nombres et l'opération à l'utilisateur
    System.out.println("Entrez les nombres et l'opération (exemple: 5 + 6) : ");
    double num1 = sc.nextDouble();
    String op = sc.next();
    double num2 = sc.nextDouble();

    // Effectue l'opération arithmétique demandée
    if (op.equals("+")) {
      System.out.println(num1 + num2);
    } else if (op.equals("-")) {
      System.out.println(num1 - num2);
    } else if (op.equals("*")) {
      System.out.println(num1 * num2);
    } else if (op.equals("/")) {
      System.out.println(num1 / num2);
    } else if (op.equals("%")) {
      System.out.println(num1 % num2);
    }

  }
}
