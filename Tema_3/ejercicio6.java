import java.util.Scanner;

public class ejercicio6 {
 public static void main(String[] args) {

  Scanner s = new Scanner(System.in);

  System.out.print("Introducir la base del triangulo en cm:");

  double base = Double.parseDouble(s.nextLine());

  System.out.print("Introducir la altura del triangulo en cm:");

  double altura = Double.parseDouble(s.nextLine());

  double area = base * altura /2;
  System.out.printf( "El area del triangulo introducido es: %.2f \n",area );

 }
}