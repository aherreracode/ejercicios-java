public class ejercicio14 {
    public static void main(String[] args) {
  
    int base;
    
    int exponente;

    int total = 0;

    System.out.print("Introduzca la base: ");
    base = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca el exponente: ");
    exponente = Integer.parseInt(System.console().readLine());

    for (int i = 0; i ==exponente;i++){

      total = base * base;

    }

    System.out.println("El calculo de su potencia es:" + total);

  }  
}