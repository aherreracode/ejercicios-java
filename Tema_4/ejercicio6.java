import java.util.Scanner;
import java.lang.*;

public class ejercicio6 {

  final static double g = 9.81;

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Calcula el tiempo que tardará en caer \n");

    System.out.print("Por favor, introduzca el valor de h: \n");

    double h = Double.parseDouble(s.nextLine());

    double total = Math.sqrt(2*h/g);

    System.out.printf("El objeto tarda %.2f segundos en caer. \n",total);
  
  }
}