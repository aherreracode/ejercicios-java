import paquetes.funciones;

public class prueba2 {
  public static void main(String[] args) {

    System.out.print("Introduzca la base: ");
    int base = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca el exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());

    System.out.println("El calculo de su potencia es:" + funciones.numPotencia(base, exponente));

  }  
}