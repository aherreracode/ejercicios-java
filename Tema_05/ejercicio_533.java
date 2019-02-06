public class ejercicio33 {
    public static void main(String[] args) {

      int altura;

      System.out.print("Introduzca la altura de la U: ");
      
      altura = Integer.parseInt(System.console().readLine());

      int palito = altura -1;

      int linea = altura/2;

      for (int i = 1; i <=palito; i++){

        System.out.print("*");

        for(int j = 1; j <=linea; j++){

          System.out.print(" ");
        }

        System.out.println("*");
      
      }
      System.out.print(" ");
      for (int c = 1; c<=linea; c++){

        System.out.print("*");
      }
      System.out.print("\n");
  }  
}  