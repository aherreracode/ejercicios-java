public class ejercicio3 {
  public static void main(String[] args) {
    
    int[] num; 
    num = new int[10];   
    //No declaramos ningun valor porque el usuario los define

    //Bucle para pedir 10 numeros
    for (int i=0; i<10;i++) {
      System.out.println("Introduzca 10 numeros (Separando cada uno por una pulsacion de enter):");
      num[i] = Integer.parseInt(System.console().readLine());
    }

    System.out.println("Los valores del array n son los siguientes: ");

    //Al hacer un for que sea decrementado mostrando cada valor del array tener en cuenta en contar el "0"
    for (int i = 9; i >= 0 ;i--) {
      System.out.println(num[i]);
        
    }
  }  
}  