public class ejercicio17 {
    public static void main(String[] args) {    
    
      int numero;

      int numero2 = 0; 

      System.out.print("Introduzca la base: ");
      numero = Integer.parseInt(System.console().readLine());

      int contador = numero;

      if (numero <0){

        System.out.print("El numero " + numero + " es negativo.\n");

      }else{

        for (int i = 1 ; i<=100 ; i++){

          System.out.println(contador);

          contador++;

          numero2 += contador;

          System.out.println("El numero " + numero + " + 100  es igual a: "+ numero2);

        }

      }
  }  
}

