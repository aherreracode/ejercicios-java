import paquetes.funciones;

public class prueba3 {
  public static void main(String[] args) {

    System.out.print("Introduzca un numero: ");
    int num = Integer.parseInt(System.console().readLine());

    System.out.println("El numero de digitos es:" + funciones.digitos(num));

  }  
}