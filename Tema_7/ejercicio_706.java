public class ejercicio6 {
    public static void main(String[] args) {
      
      int[] num; // se define num como un array de enteros
      num = new int[15]; // se reserva espacio para 10 enteros

      for (int i=0; i<16;i++) {

        System.out.println("Introduzca 15 numeros (Separando cada uno por una pulsacion de enter):");
        num[i] = Integer.parseInt(System.console().readLine());

      }

      int aux = num[0];

      for(int i=0; i<16;i++){
        
        if(i==15){
          num[i] = aux;
        }else{
          num[i] = num[i+1];
        }
        
        System.out.println("Posicion[" + i + "]=" + num[i]);
      
      }
  }  
}  