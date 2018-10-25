import java.util.Scanner;

public class ejercicio12 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int respuesta1;

    int respuesta2;

    int respuesta3;

    int totalpuntos;

    System.out.println("¿De que color es la pared de la clase?");

    System.out.println("1.Color Amarillo");

    System.out.println("2.Color azul");

    respuesta1 = s.nextInt();

    if (respuesta1 == 1){

     respuesta1 = 1;

    }else {

      respuesta1 = 0;

    }

    System.out.println("¿Cuantas filas hay en la clase?");

    System.out.println("1.Hay dos filas.");

    System.out.println("2.Hay cinco filas.");

    respuesta2 = s.nextInt();

    if (respuesta2 == 2){

     respuesta2 = 1;

    }else {

      respuesta2 = 0;

    }

    System.out.println("¿Cuanto proyectores hay en la clase?");

    System.out.println("1.Hay un proyector.");

    System.out.println("2.Hay ocho proyectores.");

    respuesta3 = s.nextInt();

    if (respuesta3 == 1){

     respuesta3 = 1;

    }else {

      respuesta3 = 0;

    }
    
    totalpuntos = respuesta1 + respuesta2 + respuesta3;

    System.out.println("Tu calificacion de puntos es : " + totalpuntos);

  }
}