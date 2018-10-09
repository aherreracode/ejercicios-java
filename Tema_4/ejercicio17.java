import java.util.Scanner;

public class ejercicio17 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduzca un número entero: ");

    int n = Integer.parseInt(System.console().readLine());
    
    System.out.println("La última cifra del número introducido es el " + (n % 10));

  }  
}