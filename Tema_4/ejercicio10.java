import java.util.Scanner;

public class ejercicio10 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int dia;

    int mes;

    System.out.print("Introduzca el dia de su cumpleaños y el mes separado por espacios(mes del 1 al 12):");

    dia = s.nextInt();

    mes = s.nextInt();

    switch (mes) {
      case 1:

      if (dia <21){

        System.out.println("Tu horoscopo es Capricornio.");

      }else {

        System.out.println("Tu horoscopo es Acuario.");

      } 
        break;
      
      case 2:

      if (dia <=19){

        System.out.println("Tu horoscopo es Acuario.");

      }else {

        System.out.println("Tu horoscopo es Piscis.");


      }
        break;

      case 3:

      if (dia <=20){

        System.out.println("Tu horoscopo es Piscis.");

      }else {

        System.out.println("Tu horoscopo es Aries.");

      }
        break;

      case 4:

      if (dia <=20){

        System.out.println("Tu horoscopo es Aries.");

      }else {

        System.out.println("Tu horoscopo es Tauro.");

      }
        break;

      case 5:

      if (dia <=21){

        System.out.println("Tu horoscopo es Tauro.");

      }else {

        System.out.println("Tu horoscopo es Geminis.");

      }
        break;

      case 6:
      if(dia <=21){

        System.out.println("Tu horoscopo es Geminis.");

      }else {

        System.out.println("Tu horoscopo es Cancer.");

      }
        break;

      case 7:
      if(dia <=22){

        System.out.println("Tu horoscopo es Cancer.");

      }else {

        System.out.println("Tu horoscopo es Leo.");

      }
        break;

      case 8:
      if(dia <=22){

        System.out.println("Tu horoscopo es Leo.");

      }else {

        System.out.println("Tu horoscopo es Virgo.");

      }
        break;

      case 9:
      if(dia <=9){

        System.out.println("Tu horoscopo es Virgo.");

      }else {

        System.out.println("Tu horoscopo es Libra.");

      }
        break;

      case 10:
      if(dia <=22){

        System.out.println("Tu horoscopo es Libra.");

      }else {

        System.out.println("Tu horoscopo es Escorpio.");

      }
        break;

      case 11:
      if(dia <=22){

        System.out.println("Tu horoscopo es Escorpio.");

      }else {

        System.out.println("Tu horoscopo es Sagitario.");

      }
        break;

      case 12:
      if(dia <=21){

        System.out.println("Tu horoscopo es Sagirario.");

      }else {

        System.out.println("Tu horoscopo es Capricornio.");

      }
        break;

      default:

        System.out.println("Ese mes no existe, prueba a escribirlo en minusculas.");

        break;
    }
    }
  }