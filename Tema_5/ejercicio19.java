public class ejercicio19 {
    public static void main(String[] args) { 

      int altura;

      String caracter;

      System.out.println("Introduce la altura de la piramide");
      altura = Integer.parseInt(System.console().readLine());

      System.out.println("Introduce el caracter de la piramide");
      caracter = System.console().readLine();

      int espacios = altura;

      int contador = 0;

      altura = altura +1;
      

      for (int i = 1 ; i <=altura ; i++){

        for (int j = 1 ; j <=espacios ; j++){

          System.out.print(" ");

        }

        for (int h = 1; h <contador; h++){

          System.out.print(caracter);
        }


        System.out.println("");
        espacios--;
        contador += 2;

      }

      
  }  
}

