import java.util.Scanner;

public class ejercicio75 {
  public static void main(String[] args) {

      Scanner s = new Scanner(System.in);

      System.out.print("Introduzca el total de su factura:");

      double base = Double.parseDouble(s.nextLine());

      double total = base / 1.21;

      System.out.printf( "La base imponible de su factura es : %.2f \n",total );
  }
}