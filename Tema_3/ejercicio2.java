import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

      Scanner s = new Scanner(System.in);

      double pesetas = 166.386;

      System.out.print("Introduce el importe de euros que desea convertir a pesetas:");

      double valor = Double.parseDouble(s.nextLine());

      int total = (int)(valor * pesetas);
  
      System.out.println( "El valor en pesetas del importe introducido:" + total );
    }
}
