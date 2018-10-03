import java.util.Scanner;

public class ejercicio5 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0 \n");

    System.out.print("Por favor, introduzca el valor de a: \n");

    double a = Double.parseDouble(s.nextLine());

    System.out.print("Por favor, introduzca el valor de b: \n");

    double b = Double.parseDouble(s.nextLine());

    double x = (-b/a);

    System.out.printf("%.2f \n",x);
  
  }
}