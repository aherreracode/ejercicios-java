public class ejercicio5 {
    public static void main(String[] args) {
  
  
      int[] num; // se define num como un array de enteros
      num = new int[12]; // se reserva espacio para 10 enteros

      int minimo = 100;
      int maximo = 0;

      for (int i=0; i<10;i++) {
        System.out.println("Introduzca 10 numeros (Separando cada uno por una pulsacion de enter):");
        num[i] = Integer.parseInt(System.console().readLine());

        if (num[i] < minimo){

          minimo = num[i];

        }else if (num[i] > maximo){

          maximo = num[i];
        }
      }

      System.out.println(" ");

      for (int i=0; i<10;i++){

        System.out.print(num[i]);

        if (num[i] == minimo){

          System.out.print("Minimo");

        }else if (num[i] == maximo){

          System.out.print("Maximo");

        }
        System.out.println(" ");

      }
  }
}