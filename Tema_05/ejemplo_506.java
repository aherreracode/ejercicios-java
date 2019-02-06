//Sumando varios numeros, tantos como se introduzca (DO WHILE)

public class ejemplo6 {
    public static void main(String[] args) {
  
    int acumulador = 0;

    int sumando = 1;  

    //do {
    for (;sumando !=0;){
  
      System.out.print("Introduzca el sumando (0 para terminar):");

      sumando = Integer.parseInt(System.console().readLine());

      acumulador += sumando;
  
    }    
    //} while (sumando !=0);

    System.out.println("La suma de los numeros introducidos es:" + acumulador);
      
  }  
}