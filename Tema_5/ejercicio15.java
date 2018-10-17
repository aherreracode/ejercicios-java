public class ejercicio15 {
    public static void main(String[] args) {
  
    int base;
    
    int exponente;

    int exponenteCont = 0;

    System.out.print("Introduzca la base: ");
    base = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca el exponente: ");
    exponente = Integer.parseInt(System.console().readLine());

    for (int i = 1; i <=exponente;i++){

      exponenteCont++;

      System.out.println(base + "^" + exponenteCont);

    }

  }  
}