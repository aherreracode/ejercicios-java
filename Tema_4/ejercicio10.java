import java.util.Scanner;

public class ejercicio10 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca el dia de su cumpleaños y el mes separado por espacios (en formato de 1-12):");

    int dia = s.nextInt();

    int mes = s.nextInt();

    if ((dia >=20) && (mes >=1)){

    System.out.print("Eres capricornio");

    }
  }
}