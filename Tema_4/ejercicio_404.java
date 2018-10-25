import java.util.Scanner;

public class ejercicio4 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana:");

    int hora = Integer.parseInt(s.nextLine());

    int hora12 = hora * 12;

    int horacalc = 40 * 12;

    int hora16 = (((hora - 40)* 16) + horacalc);

    if (hora <=40) {

      System.out.printf("El sueldo semanal que le corresponde es de: %d euros \n",hora12);
  
    }else if (hora >=41) {

      System.out.printf("El sueldo semanal que le corresponde es de: %d euros \n",hora16);

    }
  }
}