import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    double euro = 166.386;

    System.out.print("Introduce el importe de pesetas que desea convertir a Euros:");

    int valor = Integer.parseInt(s.nextLine());

    double total = valor / euro;
        
    System.out.printf( "El valor en euros del importe introducido: %.2f \n",total );

  }
}
