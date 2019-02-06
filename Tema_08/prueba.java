import paquetes.funciones;

public class prueba {
    public static void main(String[] args) {    
    
    int num;
    int digito;
    int quitar;
    int anadir;

    System.out.println("Introduce un numero, para saber si es primo o no");
    num=Integer.parseInt(System.console().readLine());

    if (funciones.esPrimo(num)){
      System.out.println("El numero "+num+", es primo.");
    
    }else{
      System.out.println("El numero "+num+", no es primo.");
    }
    
    System.out.println("El siguiente numero primo es: "+funciones.siguientePrimo(num));

    System.out.println("/-----------------------------------------------------------------------/");

    System.out.println("Introduce una posicion de digito para sacar por pantalla");
    digito = Integer.parseInt(System.console().readLine());

    System.out.println("El numero extraido es: "+funciones.digitoN(num, digito));

    System.out.println("/-----------------------------------------------------------------------/");

    System.out.println("La primera ocurrencia del numero introducido: "+funciones.posicionDeDigito(num, digito));

    System.out.println("/-----------------------------------------------------------------------/");

    System.out.println("Introduce el numero de digitos que le quieres quitar desde la derecha:");
    quitar = Integer.parseInt(System.console().readLine());

    System.out.println("El numero con digitos quitados es: "+funciones.quitaPorDetras(num, quitar));

    System.out.println("/-----------------------------------------------------------------------/");

    System.out.println("Introduce el numero de digitos que le quieres quitar desde la izquierda:");
    quitar = Integer.parseInt(System.console().readLine());

    System.out.println("El numero con digitos quitados es: "+funciones.quitaPorDelante(num, quitar));

    System.out.println("/-----------------------------------------------------------------------/");

    System.out.println("Introduce el numero que le quieres anadir por la izquierda:");
    anadir = Integer.parseInt(System.console().readLine());

    System.out.println("El numero con el numero anadido por la izquierda es: "+funciones.pegaPorDelante(num, anadir));

    System.out.println("/-----------------------------------------------------------------------/");
    
    System.out.println("Introduce el numero que le quieres anadir por la derecha:");
    anadir = Integer.parseInt(System.console().readLine());

    System.out.println("El numero con el numero anadido por la derecha es: "+funciones.pegaPorDetras(num, anadir));

    System.out.println("/-----------------------------------------------------------------------/");

    
    
  }  
}
