public class ejercicio9 {
  public static void main(String[] args) {

    int[] num = new int[8];

    for (int i = 0; i < 8; i++) {

      System.out.println("Introduzca numeros (Separando cada uno por una pulsacion de enter):");
      num[i] = Integer.parseInt(System.console().readLine());
		
    }

    for (int i = 0; i < 8; i++){
      
      if(num[i]%2 == 0){
      
        System.out.println(num[i]+" /Par");
      
      }else{
      
        System.out.println(num[i]+" /Impar");
      
      }
    }
  }  
}  