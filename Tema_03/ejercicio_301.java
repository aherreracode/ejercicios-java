import java.util.Scanner;

public class ejercicio1 {
  public static void main(String []args) {
   Scanner s = new Scanner(System.in);   

    System.out.print("Inserte los numeros a multiplicar separados por espacios:");

    int primero = s.nextInt();
    int segundo = s.nextInt();

    int total = primero * segundo;
    
    System.out.println("La multiplicacion de ambos numeros es:" + total);
  }
}
