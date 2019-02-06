public class ejercicio11 {
    public static void main(String[] args) {

      int[] num = new int[10];
      int[] primos = new int[10];
      int[] noprimos = new int[10];  

      for (int i=0; i < 10; i++) {
        System.out.println("Introduzca 10 numeros (Separando cada uno por una pulsacion de enter):");
        num[i] = Integer.parseInt(System.console().readLine());
      }

      int contadorPrimos = 0;
      int contadorNoPrimos = 0;

      for(int i= 0; i < 10; i++){

        //Condicionantes
        for (int j=2;j<3;j++){
        
          int resultado=num[j]%j;
              
            if(resultado==0){

              primos[contadorPrimos] = num[j];
              contadorPrimos++;
            
            }else{
              
              noprimos[contadorNoPrimos] = num[j];
              contadorNoPrimos++;
            }
      
        }       

      }

      for (int i = 0; i < contadorPrimos;i++) {
        num[i] = primos[i];
      }
  
      for (int i = 0; i < contadorNoPrimos;i++) {
        num[contadorPrimos + i] = noprimos[i];
      }
  
      for (int i = 0; i < 10;i++) {
        System.out.printf("%8d |",num[i]);
        System.out.println("");  
      }
  }  
}  