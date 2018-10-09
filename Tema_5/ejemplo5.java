//Sumando varios numeros, tantos como se introduzca

public class ejemplo5 {
    public static void main(String[] args) {
  
    int acumulador = 0;

    int sumando;  

    System.out.print("Introduzca el nº de números que quiere sumar:");
    int numSumandos = Integer.parseInt(System.console().readLine());

    int i=0;
    while (i<numSumandos){
  
      System.out.print("Introduzca el sumando nº" +i +":");

      sumando = Integer.parseInt(System.console().readLine());

      acumulador += sumando;

      i++;
  
    }

    System.out.println("La suma de los" + numSumandos + "numeros introducidos" + acumulador);
      
  }  
}