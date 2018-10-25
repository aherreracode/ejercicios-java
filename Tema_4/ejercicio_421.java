import java.util.Scanner;

public class ejercicio21 {
  public static void main(String[] args) {

   Scanner s = new Scanner(System.in);

   double nota1;
   double nota2;
   double notamedia;

   int cristina;

   System.out.print("Nota del primer control:");

   nota1 = Double.parseDouble(s.nextLine());

   System.out.print("Nota del segundo control:");
   
   nota2 = Double.parseDouble(s.nextLine());

   notamedia = (nota1 + nota2) /2;

   if (notamedia >=5){

      System.out.printf("Tu nota de programacion es: %.2f \n",notamedia);

   }else if (notamedia <5){

      System.out.println("¿Cual ha sido el resultado de la recuperacion? (apto = 1/no apto = 2)");

      cristina = Integer.parseInt(s.nextLine());

      if (cristina == 1){

         System.out.println("Tu nota de programacion es un 5");

      }else if (cristina == 2){

         System.out.printf(" Tu nota de programacion es %.2f \n",notamedia);
      }else {

         System.out.println("Resultado erroneo");

      }

   }
  }
}