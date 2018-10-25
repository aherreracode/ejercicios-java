public class ejercicio5 {
    public static void main(String[] args) {
  
      int numero = 0;

      int maximo = 0;

      int minimo = 200;

      int acumulador = 0;

      for(int i = 1; i<=50; i++){
        numero = (int)(Math.random()*100) + 100;

        if (numero >= maximo){ maximo = numero;}
        if (numero <= minimo){ minimo = numero;}

        acumulador += numero;

        System.out.print(+numero+" ");
      }
      System.out.println("");

      int media = acumulador / 50;

      System.out.println("El numero maximo es: "+maximo);
      System.out.println("El numero minimo es: "+minimo);
      System.out.println("La media es: "+media);

  }
}
  