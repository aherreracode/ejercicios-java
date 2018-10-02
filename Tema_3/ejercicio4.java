import java.util.Scanner;

public class ejercicio4 {
  public static void main(String []args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Inserte los numeros a sumar separados por espacios:");

    int primero = s.nextInt();
    int segundo = s.nextInt();

    int suma = primero + segundo;
    int resta = primero - segundo;
    int multiplicacion = primero * segundo;
    int division = primero / segundo;

    System.out.printf("El resultado de la suma es igual a : %d \n",suma);

    System.out.printf("El resultado de la resta es igual a : %d \n",resta);

    System.out.printf("El resultado de la multiplicacion es igual a : %d \n",multiplicacion);

    System.out.printf("El resultado de la division es igual a : %d \n",division);   
    
  }
}
