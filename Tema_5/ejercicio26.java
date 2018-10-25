public class ejercicio26 {
    public static void main(String[] args) { 
      
      //Integer.toString(numIntroducido).length()

      System.out.print("Introduzca un número entero: ");
      
      int numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      long numero = numeroIntroducido;

      System.out.print("Introduzca un digito entero: ");

      long digitoIntroducido = Integer.parseInt(System.console().readLine());
      
      long volteado = 0;

      long posicion = 0;
      
      while (numero > 0) {

        if ((numero % 10)==digitoIntroducido){

          posicion += Long.toString(volteado).length();

          posicion += 1;

          System.out.println("El digito/s introducido esta en la posicion/es: " + (((Integer.toString(numeroIntroducido).length()) - posicion) +1) );
        }

        volteado = (volteado * 10) + (numero % 10);
        numero /= 10;
        System.out.println("volteado"+volteado);
        System.out.println("numero"+numero);
        posicion = 0;
      } 
      
      System.out.println("Si le damos la vuelta al " + numeroIntroducido + " tenemos el " + volteado);

  }  
}  
    