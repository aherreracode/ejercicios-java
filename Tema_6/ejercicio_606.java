public class ejercicio6 {
    public static void main(String[] args) {
  
      int numero = (int)(Math.random()*101);

      int adivina = 0;

      for(int i = 1; ((numero!=adivina)&&(i<=5)); i++){

        System.out.println("Adivine el numero de entre 0-100: ");
        adivina = Integer.parseInt(System.console().readLine());

        if (adivina==numero){
          System.out.println("Ha acertado el numero.");
        }else if (adivina < numero){
          System.out.println("El numero a adivinar es mayor que el introducido.");
        }else if (adivina > numero){
          System.out.println("El numero a adivinar es menor que el introducido.");
        }

        System.out.println("Intentos realizados: "+i+ " ,Maximo de intentos 5.");
      }
  }
}
  