import java.util.Scanner;

public class ejercicio12 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la nota del primer examen:");

    double nota1 = Double.parseDouble(s.nextLine());

    System.out.print("Introduzca la nota media deseada:");

    double media = Double.parseDouble(s.nextLine());

    double nota1f = nota1 * 0.40;

    double nota2f = media - nota1f;

    double nota2 = nota2f / 0.60;
    
    System.out.printf( "La nota necesaria en el segundo examen es : %.2f \n",nota2);
 }
}
