import paquetes.funciones;

public class ejercicio29 {  
  public static void main (String[] args) {

    int array[][] = funciones.generaArrayBiInt(4, 8, 2, 9);

    funciones.mostrarArrayBi(array,4,8);

    System.out.println("- - - - - - - - ");

    funciones.filaDeArrayBiInt(array, 4, 8, 2);
    
    System.out.println("");

    System.out.println("- - - - - - - - ");

    funciones.columnaDeArrayBiInt(array, 4, 8, 2);

    funciones.coordenadasEnArrayBiInt(array, 4, 8, 10);






  }
}