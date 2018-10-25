public class ejercicio23 {
    public static void main(String[] args) { 

      int acumulador = 0;

      int numero;

      int numeroCont = 0;

      int media;
      
      do {

        System.out.println("Introduzca numero, sin exceder el limite (10000)");
        numero = Integer.parseInt(System.console().readLine());
        
        if (acumulador > 10000){break;}
        
        acumulador += numero;

        numeroCont++;

      } while (acumulador <= 10000);

      media = acumulador / numeroCont;
      
      if (acumulador > 10000){

        System.out.println("Limite excedido.");
        System.out.println("La media es: "+ media);
        System.out.println("Numeros totales introducidos: "+ numeroCont);
        System.out.println("El total acumulado es de: "+ acumulador);        
        
      }else{
    
        System.out.println("La media es: "+ media);
        System.out.println("Numeros totales introducidos: "+ numeroCont);
        System.out.println("El total acumulado es de: "+ acumulador);
      
      
      }
  }  
}  
    