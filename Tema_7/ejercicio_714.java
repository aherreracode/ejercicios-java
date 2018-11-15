public class ejercicio14 {
  public static void main(String[] args) {

    String[] colores = { "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
    String[] palabra = new String[8];
    String[] nuevo = new String[8];

    for (int i=0; i < 8; i++) {
      System.out.println("Introduzca 8 palabras (Separando cada uno por una pulsacion de enter):");
      palabra[i] = System.console().readLine();
    }

    System.out.println(" ");
    System.out.println("Array inicial:");
    System.out.println("┌────────────┬────────────┬────────────┬────────────┬────────────┬────────────┬────────────┬────────────┐");
    System.out.println("│      0     │     1      │      2     │      3     │      4     │      5     │      6     │      7     │");
    System.out.println("├────────────┼────────────┼────────────┼────────────┼────────────┼────────────┼────────────┼────────────┤");
    System.out.printf("│%12s│%12s│%12s│%12s│%12s│%12s│%12s│%12s│\n",palabra[0],palabra[1],palabra[2],palabra[3],palabra[4],palabra[5],palabra[6],palabra[7]);
    System.out.println("└────────────┴────────────┴────────────┴────────────┴────────────┴────────────┴────────────┴────────────┘");


    int contador = 0;
    int contador1 = 7;
    boolean color =false;

    //Seleccionar palabra
    for(int i=0; i < 8; i++){

      //Bucle comprueba valores
      for(int j=0; ((j<9)&&(color == false)) ;j++){
        
        //Comprobar si es color
        if (palabra[i].equals(colores[j])){
          nuevo[contador] = palabra[i];
          contador++;
          color = true;
        }

      }

      //Si no es color añadelo desde la ultima posicion del array
      if (color == false){
        nuevo[contador1] = palabra[i];
        contador1--;
      }

      //Cambia color a false para poder hacer 2º bucle for
      color = false;
    }

    System.out.println(" ");
    System.out.println("Array final:");
    System.out.println("┌────────────┬────────────┬────────────┬────────────┬────────────┬────────────┬────────────┬────────────┐");
    System.out.println("│      0     │     1      │      2     │      3     │      4     │      5     │      6     │      7     │");
    System.out.println("├────────────┼────────────┼────────────┼────────────┼────────────┼────────────┼────────────┼────────────┤");
    System.out.printf("│%12s│%12s│%12s│%12s│%12s│%12s│%12s│%12s│\n",nuevo[0],nuevo[1],nuevo[2],nuevo[3],nuevo[4],nuevo[5],nuevo[6],nuevo[7]);
    System.out.println("└────────────┴────────────┴────────────┴────────────┴────────────┴────────────┴────────────┴────────────┘");

    






  }
}