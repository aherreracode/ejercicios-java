public class ejercicio12 {
    public static void main(String[] args) {
  
    int n1 = 0;

    int n2 = 1;

    int aux;
    
    int vueltas;

    System.out.print("Introduzca el número: ");
    vueltas = Integer.parseInt(System.console().readLine());
    
  for (int i=0; i <º1vueltas; i++){

      if (i ==0){

        System.out.println("Numero obtenido en vuelta num0:0");

      }else if(i ==1){

        System.out.println("Numero obtenido en vuelta num1:1");

      }else{

        aux = n2;
      
        n2 = n1 + n2;
  
        n1 = aux;
  
        System.out.println("Numero obtenido en vuelta num"+ i + ":"+ n2);
      }
    }
  }  
}