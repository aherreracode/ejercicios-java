import paquetes.funciones;

public class ejercicio20 {  
  public static void main (String[] args) {

    System.out.println("Introduce tamano:");
    int tamano = Integer.parseInt(System.console().readLine());

    System.out.println("Introduce min:");
    int minimo = Integer.parseInt(System.console().readLine());

    System.out.println("Introduce max:");
    int maximo = Integer.parseInt(System.console().readLine());

    int array[] = funciones.generaArrayInt(tamano, minimo, maximo);
    
    System.out.println("- - - - - - - - -");
    
    funciones.mostrarArray(array);

    System.out.println("El minimo es: "+funciones.minimoArrayInt(array));

    System.out.println("El maximo es: "+funciones.maximoArrayInt(array));

    System.out.println("El media es: "+funciones.mediaArrayInt(array));
    
    System.out.println("Inserte el numero para ver si esta en array: ");

    int num = Integer.parseInt(System.console().readLine());

    System.out.println("Esta el numero? "+funciones.estaEnArrayInt(array, num));

    System.out.println("Array volteado: ");
    funciones.mostrarArray(funciones.voltearArray(array));

    System.out.println("rota izquierda, inserta nº de veces:");

    int posiciones = Integer.parseInt(System.console().readLine());

    funciones.mostrarArray(funciones.rotaIzquierdaArrayInt(array, posiciones));

    System.out.println("");

    System.out.println("rota derecha, inserta nº de veces:");

    int posiciones2 = Integer.parseInt(System.console().readLine());

    funciones.mostrarArray(funciones.rotaDerechaArrayInt(array, posiciones2));

  }
}