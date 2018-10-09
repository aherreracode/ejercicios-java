//Sumando varios numeros, tantos como se introduzca (DO WHILE + IF)

public class ejemplo3 {
    public static void main(String[] args) {
  
    int acumulador = 0;

    int sumando;  

    do {
  
        System.out.print("Introduzca el sumando (1 para terminar):");

        sumando = Integer.parseInt(System.console().readLine());

      if (sumamando !=1){

        acumulador += sumando;

      }
  
    } while (sumando !=0);

    System.out.println("La suma de los numeros introducidos es:" + acumulador);
      
  }  
}