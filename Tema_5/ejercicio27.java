public class ejercicio27 {
    public static void main(String[] args) { 
      
      int numIntroducido;

      int numMaximo;

      int muestre = 0;

      int multiplo = 0;

      int acumulador = 0;

      int multiplicador = 1;

      System.out.print("Introduzca un número entero: ");
      
      numIntroducido = Integer.parseInt(System.console().readLine());

      System.out.print("Introduzca hasta el numero que desea obtener los multiplos: ");
      
      numMaximo = Integer.parseInt(System.console().readLine());

      while (multiplo < numMaximo) {

        muestre = numIntroducido*multiplicador;

        System.out.println("Multiplos de "+ numIntroducido +":" + muestre);

        multiplo++;
        acumulador += muestre; 
        multiplicador++;
      }
      System.out.println("Se han contado "+ multiplo + " Multiplos.");
      System.out.println("La suma de los "+ multiplo + " multiplos, es igual a: "+ acumulador);
  }  
}  
    