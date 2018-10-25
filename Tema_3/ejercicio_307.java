import java.util.Scanner;

public class ejercicio7 {
  public static void main(String[] args) {

      Scanner s = new Scanner(System.in);

      System.out.print("Introduzca el total de la base imponible de su factura:");

      double base = Double.parseDouble(s.nextLine());

      double total = base * 1.21;

      System.out.printf( "El total de la factura es : %.2f \n",total );
 }
}