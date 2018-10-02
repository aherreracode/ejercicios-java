import java.util.Scanner;

public class ejercicio8 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca tres notas para calcular la media separadas por espacios:");

    double nota1 = Double.parseDouble(s.nextLine());

    System.out.print("Introduzca tres notas para calcular la media separadas por espacios:");

    double nota2 = Double.parseDouble(s.nextLine());

    System.out.print("Introduzca tres notas para calcular la media separadas por espacios:");

    double nota3 = Double.parseDouble(s.nextLine());

    double media = ((nota1 + nota2 + nota3) /3);

    System.out.printf("Tu nota media es de: %.2f \n",media);

    if (media <=4.99){

      System.out.println("Tu nota es un insuficiente.");

    }else if ((media >=5.0)&&(media <=5.99)){

      System.out.println("Tu nota es un suficiente.");

    }else if ((media >=6)&&(media <=7.99)) {

      System.out.println("Tu nota es un bien.");

      
    }else if ((media >=8)&&(media <=9.99)) {

      System.out.println("Tu nota es notale.");

    }else if (media <=10) {

      System.out.println("Tu nota es sobresaliente.");
    }  
  }
}