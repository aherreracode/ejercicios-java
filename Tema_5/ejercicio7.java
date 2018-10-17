public class ejercicio7 {
    public static void main(String[] args) {
  
      int pinIntroducido = 0;
      int contador = 0;
      
      for (int i = 1234;((pinIntroducido !=1234)&&(contador <=3));){
      
        System.out.print("Introduzca 4 digitos para desbloquear la caja fuerte: \n");
        pinIntroducido = Integer.parseInt(System.console().readLine());
        
        if (pinIntroducido !=1234){
          
          System.out.print("Lo siento, esa no es la combinación \n");
          contador++;

        }
      }

      if ((contador <4)&&(pinIntroducido == 1234)){

        System.out.print("La caja fuerte se ha abierto satisfactoriamente. \n");
      
      }else{

        System.out.print("Has agotado el maximo numero de intentos. \n");

      }
  }  
}