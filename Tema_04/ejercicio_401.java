import java.util.Scanner;

public class ejercicio1 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca el dia de la semana, para ver que toca a primera:");

    String dia = s.nextLine();

    if (dia.equals("Lunes")) {

      System.out.println("Toca sistemas informaticos!");
  
    }else if (dia.equals("Martes")) {

      System.out.println("Toca programacion!");
      
    }else if (dia.equals("Miercoles")) {

      System.out.println("Toca Entornos de desarrollo!");

    }else if (dia.equals("Jueves")) {

      System.out.println("Toca Entornos de desarrollo!");
     
    }else if (dia.equals("Viernes")) {

      System.out.println("Toca Sistemas informaticos!");
    
    }
  }
}
