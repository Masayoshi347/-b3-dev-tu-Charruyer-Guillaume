package main.src;
import java.util.Scanner;

public class Calculatrice {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
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

      // Demande l'opération scientifique à l'utilisateur
      System.out.println("Entrez l'opération scientifique à effectuer (carré, racine carrée, puissance) : ");
      String sciOp = sc.next();

      // Effectue l'opération scientifique demandée
      if (sciOp.equals("carré")) {
        System.out.println(Math.pow(num1, 2));
      } else if (sciOp.equals("racine carrée")) {
        System.out.println(Math.sqrt(num1));
      } else if (sciOp.equals("puissance")) {
        System.out.println(Math.pow(num1, num2));
      }
    }

  }

  public static double performOperation(int i, String string, int j) {
    return 0;
  }
}
