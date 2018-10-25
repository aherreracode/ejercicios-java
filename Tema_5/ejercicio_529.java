public class ejercicio29 {
    public static void main(String[] args) { 

      int numIntroducido;

      int numDivisor;

      int resultado;

      System.out.print("Introduzca un número entero: ");
      
      numIntroducido = Integer.parseInt(System.console().readLine());

      System.out.print("Introduzca el numero divisor: ");
      
      numDivisor = Integer.parseInt(System.console().readLine());

      int contador = numIntroducido;

      while (contador >=2) {

        resultado = contador%numDivisor;

        if (resultado != 0){

          System.out.println("El numero "+ contador +" no es divisible.");

        }

       contador--;
        
      }
      System.out.println("El numero 1 no es divisible.");
  }  
}  