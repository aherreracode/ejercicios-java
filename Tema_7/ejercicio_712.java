public class ejercicio12 {
    public static void main(String[] args) {

      int[] num = new int[10];

      for (int i=0; i < 10; i++) {
        System.out.println("Introduzca 10 numeros (Separando cada uno por una pulsacion de enter):");
        num[i] = Integer.parseInt(System.console().readLine());
      }
      System.out.println();
      for(int i=0; i < 10; i++){
        System.out.println(num[i]);
      }
      
      System.out.println(" ");

      int primero = 0;
      System.out.println("Introduzca la posicion inicial");
      primero = Integer.parseInt(System.console().readLine());

      int segundo = 0;
      System.out.println("Introduzca la posicion inicial");
      segundo = Integer.parseInt(System.console().readLine());

      int aux = num[segundo];
      int aux_final = num[9];

      int aux2;
      for(int i=(segundo+1); i<10 ; i++){
        aux2 = num[i];
        num[i] = aux;
        aux = aux2;
        
      }
      
      num[segundo] = num[primero];
      
      for(int i=0; i<=primero ; i++){
        aux2 = num[i];
        num[i] = aux;
        aux = aux2;
        
      }

      System.out.println();
      for(int i=0; i < 10; i++){
        System.out.println(num[i]);
      }

  }
}