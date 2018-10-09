import java.util.Scanner;

public class ejercicio16 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int respuesta1;
    int respuesta2;
    int respuesta3;
    int respuesta4;
    int respuesta5;
    int respuesta6;
    int respuesta7;
    int respuesta8;
    int respuesta9;
    int respuesta10;
    int total;

    System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");

    System.out.println("1.Verdadero.");

    System.out.println("2.Falso.");

    respuesta1 = s.nextInt();

    if (respuesta1 == 1){

      respuesta1 = 3;

    }else {

      respuesta1 = 0;

    }

    System.out.println("2. Ha aumentado sus gastos de vestuario");

    System.out.println("1.Verdadero.");

    System.out.println("2.Falso.");

    respuesta2 = s.nextInt();

    if (respuesta2 == 1){

      respuesta2 = 3;

    }else {

      respuesta2 = 0;

    }

    System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");

    System.out.println("1.Verdadero.");

    System.out.println("2.Falso.");

    respuesta3 = s.nextInt();

    if (respuesta3 == 1){

      respuesta3 = 3;

    }else {

      respuesta3 = 0;

    }

    System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");

    System.out.println("1.Verdadero.");

    System.out.println("2.Falso.");

    respuesta4 = s.nextInt();

    if (respuesta4 == 1){

      respuesta4 = 3;

    }else {

      respuesta4 = 0;

    }

    System.out.println("5. No te deja que mires la agenda de su teléfono móvil");

    System.out.println("1.Verdadero.");

    System.out.println("2.Falso.");

    respuesta5 = s.nextInt();

    if (respuesta5 == 1){

      respuesta5 = 3;

    }else {

      respuesta5 = 0;

    }

    System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");

    System.out.println("1.Verdadero.");

    System.out.println("2.Falso.");

    respuesta6 = s.nextInt();

    if (respuesta6 == 1){

      respuesta6 = 3;

    }else {

      respuesta6 = 0;

    }

    System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");

    System.out.println("1.Verdadero.");

    System.out.println("2.Falso.");

    respuesta7 = s.nextInt();

    if (respuesta7 == 1){

      respuesta7 = 3;

    }else {

      respuesta7 = 0;

    }

    System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");

    System.out.println("1.Verdadero.");

    System.out.println("2.Falso.");

    respuesta8 = s.nextInt();

    if (respuesta8 == 1){

      respuesta8 = 3;

    }else {

      respuesta8 = 0;

    }

    System.out.println("9. Has notado que últimamente se perfuma más");

    System.out.println("1.Verdadero.");

    System.out.println("2.Falso.");

    respuesta9 = s.nextInt();

    if (respuesta9 == 1){

      respuesta9 = 3;

    }else {

      respuesta9 = 0;

    }

    System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");

    System.out.println("1.Verdadero.");

    System.out.println("2.Falso.");

    respuesta10 = s.nextInt();

    if (respuesta10 == 1){

      respuesta10 = 3;

    }else {

      respuesta10 = 0;

    }

    total = respuesta1 + respuesta2 + respuesta3 + respuesta4 + respuesta4 + respuesta5 + respuesta6 + respuesta7 + respuesta8 + respuesta9 + respuesta10;

    if (total <=10) {

      System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");

    }else if ((total >=11)&&(total <=22)) {

      System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");

    }else if ((total >23)&&(total <=30)){

      System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");

    }
  }
}