//Sumando varios numeros, tantos como se introduzca

public class ejemplo1 {
    public static void main(String[] args) {
  
    int acumulador = 0;

    int sumando;  

    System.out.print("Introduzca el nº de números que quiere sumar:");
    int numSumandos = Integer.parseInt(System.console().readLine());


      for (int i=1; i<=numSumandos; i++){
  
        System.out.print("Introduzca el sumando nº" +i +":");

        sumando = Integer.parseInt(System.console().readLine());

        acumulador += sumando;
  
      }

    System.out.println("La suma de los" + numSumandos + "numeros introducidos" + acumulador);
      
  }  
}