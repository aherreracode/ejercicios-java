import paquetes.funciones;

public class palotes {
  public static void main(String[] args) {    

    System.out.println("Introduce un numero, para saber su codigo en palotes:");
    int num=Integer.parseInt(System.console().readLine());
    
    System.out.println(funciones.convierteEnPalotes(num));

  }
}   