import java.util.Scanner;

public class ejercicio7 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca tres notas para calcular la media separadas por espacios:");

    double nota1 = Double.parseDouble(s.nextLine());

    System.out.print("Introduzca tres notas para calcular la media separadas por espacios:");

    double nota2 = Double.parseDouble(s.nextLine());

    System.out.print("Introduzca tres notas para calcular la media separadas por espacios:");

    double nota3 = Double.parseDouble(s.nextLine());

    double media = ((nota1 + nota2 + nota3) /3);

    System.out.printf("Tu nota media es de: %.2f \n",media);
  }
}