public class ejercicio7 {
    public static void main(String[] args) {

    String valor1 = " ";

    String valor2 = " ";

    String valor3 = " ";

    System.out.println("- - - - - - - - - - - - - - - - - -");

    System.out.println("Quiniela 1   1 x 2");
    System.out.println(". . . . . . . . . ");
  
    for (int i = 1; i<=15; i++){

      int numero = (int)(Math.random()*3);

      if (numero == 0){
        valor1 = "x";
      }else if (numero == 1){
        valor2 = "x";
      }else if (numero == 2){
        valor3 = "x";
      }

      System.out.printf("Partido %2d: ",i); 
      System.out.println(" "+valor1+" "+valor2+" "+valor3);

      //Reseteamos variables
      valor1 = " ";
      valor2 = " ";
      valor3 = " ";
    }

    System.out.println("- - - - - - - - - - - - - - - - - -");

    System.out.println("Quiniela 2   1 x 2");
    System.out.println(". . . . . . . . . ");
  
    for (int i = 1; i<=15; i++){

      int numero = (int)(Math.random()*3);

      if (numero == 0){
        valor1 = "x";
      }else if (numero == 1){
        valor2 = "x";
      }else if (numero == 2){
        valor3 = "x";
      }

      System.out.printf("Partido %2d: ",i); 
      System.out.println(" "+valor1+" "+valor2+" "+valor3);

      //Reseteamos variables
      valor1 = " ";
      valor2 = " ";
      valor3 = " ";
    } 

    System.out.println("- - - - - - - - - - - - - - - - - -");

    System.out.println("Quiniela 3   1 x 2");
    System.out.println(". . . . . . . . . ");
  
    for (int i = 1; i<=15; i++){

      int numero = (int)(Math.random()*3);

      if (numero == 0){
        valor1 = "x";
      }else if (numero == 1){
        valor2 = "x";
      }else if (numero == 2){
        valor3 = "x";
      }

      System.out.printf("Partido %2d: ",i); 
      System.out.println(" "+valor1+" "+valor2+" "+valor3);

      //Reseteamos variables
      valor1 = " ";
      valor2 = " ";
      valor3 = " ";
    } 
  }
}
  