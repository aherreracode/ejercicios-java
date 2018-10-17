public class ejercicio9 {
    public static void main(String[] args) {
  
      int numeroDeDigitos = 1, 
      int n;
      int numeroIntroducido;

      System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      n = numeroIntroducido;
      
      while (n > 10) {
        
        n /= 10;
        numeroDeDigitos++;
      
      }
      
      System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígito/s.");
  }  
}