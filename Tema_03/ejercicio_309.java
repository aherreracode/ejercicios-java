import java.util.Scanner;

public class ejercicio9 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introducir la medida de altura:");

    int altura = Integer.parseInt(s.nextLine());

    System.out.print("Introducir la medida del radio base:");

    int base = Integer.parseInt(s.nextLine());

    double volumen = (((3.14 * (base * base)) * altura) / 3);
    
    System.out.printf( "El volumen del cono introducido es: %.2f \n",volumen );
 }
}