public class ejercicio10 {
    public static void main(String[] args) {
  
    double acumulador = 0;

    double sumando = 1;
    
    double totalNum = 0;

    while ( sumando >=0 ){

      System.out.print("Introduzca el sumando (numero negativo para terminar):");

      sumando = Double.parseDouble(System.console().readLine());

      if (sumando <0){break;}

      acumulador += sumando;

      totalNum ++;
    }

    double media = acumulador / totalNum;

    System.out.println("La suma de los numeros introducidos es:" + media);
    
  }  
}