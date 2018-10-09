import java.util.Scanner;

public class ejercicio19 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int numero;

    System.out.print("Por favor, introduzca un número entero: ");

    numero = s.nextInt();


    if ((numero <= -1)&&(numero > -10)){

        System.out.println("El numero tiene un digito y es negativo.");

    }else if ((numero <= -10)&&(numero >= -99)){

        System.out.println("El numero tiene dos digitos y es negativo.");

    }else if ((numero <= -100)&&(numero >= -999)){

        System.out.println("El numero tiene tres digitos y es negativo.");

    }else if ((numero <= -1000)&&(numero >= -9999)){

        System.out.println("El numero tiene cuatro digitos y es negativo.");

    }else if ((numero <= -10000)&&(numero >= -99999)){

        System.out.println("El numero tiene cinco digitos y es negativo.");

    }

    //////////////////////////////////////////////////////////////////////////

    if ((numero >=1)&&(numero <10)){

        System.out.println("El numero tiene un digito y es positivo.");

    }else if ((numero >=10)&&(numero <=99)){

        System.out.println("El numero tiene dos digitos y es positivo.");

    }else if ((numero >=100)&&(numero <=999)){

        System.out.println("El numero tiene tres digitos y es positivo.");

    }else if ((numero >=1000)&&(numero <=9999)){

        System.out.println("El numero tiene cuatro digitos y es positivo.");

    }else if ((numero >=10000)&&(numero <=99999)){

        System.out.println("El numero tiene cinco digitos y es positivo.");

    }
  }  
}