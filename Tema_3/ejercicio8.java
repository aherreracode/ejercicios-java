import java.util.Scanner;

public class ejercicio8 {
 public static void main(String[] args) {

  Scanner s = new Scanner(System.in);

  System.out.print("Introduzca el total de horas trabajadas:");

  int trabajadas = Integer.parseInt(s.nextLine());

  int hora = 12;

  int diario = hora * trabajadas;

  double total = diario * 5;

  System.out.printf( "El total de la factura es : %.2f \n",total);

 }
}