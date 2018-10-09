import java.util.Scanner;

public class prueba {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int laVoluntad;

    System.out.println("Hasta que numero desea contar:");

    laVoluntad = s.nextInt();

    for (int i=1; i<= laVoluntad; i++){

        System.out.println(i);

    }
  }  
}