import java.util.Scanner;

public class ejercicio11 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca los Kb que desea convertir a Mb:");

    double valor = Double.parseDouble(s.nextLine());

    double kb = 1024;

    double total = valor / kb;
    
    System.out.printf( "El total en Megabytes es : %.2f \n",total);
 }
}