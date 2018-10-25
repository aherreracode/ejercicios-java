public class ejercicio28 {
    public static void main(String[] args) { 

      int numIntroducido;

      int contador = 1;

      int acumulador = 1;
      
      System.out.print("Introduzca un número entero: ");
      
      numIntroducido = Integer.parseInt(System.console().readLine());

      while (contador <= numIntroducido) {

        acumulador = acumulador * contador;

        contador++;
      }
      System.out.println( + numIntroducido +"! ="+ acumulador);
  }  
}  