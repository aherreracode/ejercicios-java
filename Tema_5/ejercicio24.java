public class ejercicio24 {
    public static void main(String[] args) { 

    int altura;

    int contador1 = 1;

    int reversa = 1;

    System.out.println("Introduce la altura de la piramide");
    altura = Integer.parseInt(System.console().readLine());

    int espacios = altura -1;

    for (int i = 1; i<=altura ; i++){

      for ( int j = 1; j<=espacios; j++){

        System.out.print("*");

      }

      for (int c = 1; c<=contador1; c++){

        System.out.print(c%10);
      }

      reversa = contador1;
      for (int a = 1; (a<=reversa)&&(i >= 2); a++){

        reversa--;
        System.out.print(reversa%10);
      }

      System.out.println(" ");
      espacios--;
      contador1++;

    }
  }  
}  
    