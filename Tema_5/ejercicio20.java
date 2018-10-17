public class ejercicio20 {
    public static void main(String[] args) { 

      int altura;

      String caracter;

      System.out.println("Introduce la altura de la piramide");
      altura = Integer.parseInt(System.console().readLine());

      System.out.println("Introduce el caracter de la piramide");
      caracter = System.console().readLine();

      int espacios = altura - 2;

      int contador = -1;

      for (int i = 1 ; i <altura ; i++){

        


        for (int j = 0 ; j <=espacios ; j++){

          System.out.print(" ");

        }

        if (i ==1){

          

        }else{

        System.out.print(caracter);

        }  

        for (int n = 0; n <=contador; n++){

          System.out.print(" ");

        }

        System.out.print(caracter);



        System.out.println("");
        espacios--;

        if (i==1){
          contador++;
        }else{
        contador += 2;
        }

        if (altura ==i + 1){

          for (int r = 1;r <= ((altura*2)-1);r++){

            System.out.print(caracter);

          }

        }
      }
      System.out.println("");
  }  
}  
