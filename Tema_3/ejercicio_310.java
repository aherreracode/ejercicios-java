import java.util.Scanner;

public class ejercicio10 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca los Mb que desea convertir a Kb:");

    double valor = Double.parseDouble(s.nextLine());

    double kb = 1024;

    double total = kb * valor;
    
    System.out.printf( "El total en Kilobytes es : %.2f \n",total);
 }
}