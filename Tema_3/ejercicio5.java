import java.util.Scanner;

public class ejercicio5 {
 public static void main(String[] args) {

  Scanner s = new Scanner(System.in);

  System.out.print("Introducir la medida de altura:");

  int altura = Integer.parseInt(s.nextLine());

  System.out.print("Introducir la medida de anchura:");

  int anchura = Integer.parseInt(s.nextLine());

  int area = altura * anchura;
  System.out.printf( "El area del rectangulo introducido es: %d \n",area );

 }
}
