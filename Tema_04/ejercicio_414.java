import java.util.Scanner;

public class ejercicio14 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int numero;

    System.out.println("Introduzca el numero para saber si es par e impar y divisible entre 5");

    numero = s.nextInt();

    if ((numero % 2) == 0){

        System.out.println("El numero es par.");

    }else{

        System.out.println("El numero es impar.");

    }
    if ((numero % 5) ==0){

        System.out.println("El numero es divisible entre 5.");
        
    }else{

        System.out.println("El numero no es divisible entre 5.");

    }
  }
}