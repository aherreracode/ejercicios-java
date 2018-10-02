import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca el numero de dia de la semana (1-7):");

    String dia = s.nextLine();

    if (dia.equals("1")) {

      System.out.println("Lunes");
  
    }else if (dia.equals("2")) {

      System.out.println("Martes");
      
    }else if (dia.equals("3")) {

      System.out.println("Miercoles");

    }else if (dia.equals("4")) {

      System.out.println("Jueves");
     
    }else if (dia.equals("5")) {

      System.out.println("Viernes");
    
    }else if (dia.equals("6")) {

      System.out.println("Sabado");
    
    }else if (dia.equals("7")) {

      System.out.println("Domingo");
    
    }
    //if(dia >=7){

    //  System.out.println("Numero incorrecto, la semana solo tiene 7 dias mozo.");

    //}
  }
}