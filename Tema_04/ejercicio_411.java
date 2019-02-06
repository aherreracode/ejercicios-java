import java.util.Scanner;

public class ejercicio11 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca hora y minutos separado por espacios: \n");

    int hora = s.nextInt();

    int mins = s.nextInt();

    int calhora = (( hora * 3600) + (mins * 60));

    int calctotal = ((24 * 3600) - calhora);

    System.out.printf("Has introducido %d horas %d minutos y quedan %d segundos. \n",hora,mins,calctotal);

  }
}