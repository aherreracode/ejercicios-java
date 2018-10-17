public class ejercicio21 {
  public static void main(String[] args) { 

    int cuentaNumeros = 0;

    int acumuladorImpar = 0;

    double numMax = 0;

    int impares = 0;

    double media;

    double numero = 1;

    while ( numero >=0 ){

      System.out.print("Introduzca el numero (numero negativo para terminar):");
  
      numero = Double.parseDouble(System.console().readLine());

      cuentaNumeros++;
    
      if (numero <=0){
        break;
      }
    
      if ((numero % 2) == 1){

        acumuladorImpar += numero;

        impares++;

      }

      if ((numero % 2) == 0){

        if (numero > numMax){

          numMax = numero;

        }

      }

    }

    cuentaNumeros--;

    media = acumuladorImpar / impares;
    
    System.out.println("Se han introducido " + cuentaNumeros +" numeros.");
    System.out.printf("La media de los impares es igual a: %1.2f \n" ,media);
    System.out.println("El mayor de los pares introducidos es:"+ numMax);
    

  }  
}  
