public class ejercicio31 {
    public static void main(String[] args) {

      int altura;

      System.out.print("Introduzca la altura de la L: ");
      
      altura = Integer.parseInt(System.console().readLine());

      int palo = (altura / 2) + 1;


      for (int i = 1; i <= (altura - 1); i++){

        System.out.println("*");

      }

      for (int j = 1; j <= palo; j++){

        System.out.print("*");
      }
    System.out.println("");
  }  
}  