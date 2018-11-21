public class ejercicio10 {
    public static void main(String[] args) {

    int[] num = new int[20];
    int[] pares = new int[20];
    int[] impares = new int[20];

    for (int i = 0; i < 20; i++) {
      num[i]=(int)(Math.random()*101);
    }

    int contadorPar = 0;
    int contadorImPar = 0;

    for(int i= 0; i < 20; i++){
      
      if (num[i]%2 == 0){
      
        pares[contadorPar] = num[i];
        contadorPar++;

      }else if (num[i]%2 != 0){
      
        impares[contadorImPar] = num[i];
        contadorImPar++;

      }
    }

    for (int i = 0; i < contadorPar;i++) {
      num[i] = pares[i];
    }

    for (int i = 0; i < contadorImPar;i++) {
      num[contadorPar + i] = impares[i];
    }

    for (int i = 0; i < 20;i++) {
      System.out.printf("%8d |",num[i]);
      System.out.println("");  
    }
  }  
}  