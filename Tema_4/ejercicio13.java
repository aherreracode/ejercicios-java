import java.util.Scanner;

public class ejercicio13 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    double a;

    double b;

    double c;

    double aux = 0;

    System.out.println("Introduce el primer numero a ordenar:");

    a = Double.parseDouble(s.nextLine());

    System.out.println("Introduce el segundo numero a ordenar:");

    b = Double.parseDouble(s.nextLine());

    System.out.println("Introduce el tercer numero a ordenar:");

    c = Double.parseDouble(s.nextLine());
    
    if (a > b){

      aux = a;
      a = b;
      b = aux;

    }
    if (b > c){

      aux = b;
      b = c;
      c = aux; 

    }
    if (a > b){

      aux = a;
      a = b;
      b = aux;

    }
    System.out.printf("Numero menor: %.2f Numero intermedio: %.2f Numero mayor: %.2f",a,b,c);
  }
}