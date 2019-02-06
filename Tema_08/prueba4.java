import paquetes.funciones;

public class prueba4 {
  public static void main(String[] args) {

    System.out.print("Introduzca un numero: ");
    int num = Integer.parseInt(System.console().readLine());

    if (funciones.esCapicua(num)){
      
    System.out.println("El numero es capicua");

    }else{
      System.out.println("El numero no es capicua");
    }
  }  
}