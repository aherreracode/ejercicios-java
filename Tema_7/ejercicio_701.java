public class ejercicio1 {
  public static void main(String[] args) {


    int[] num; // se define num como un array de enteros
    num = new int[12]; // se reserva espacio para 12 enteros
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;
    /* num[11] = 120; Al recorrer un array si el ultimo espacio reservado del array no tiene nada no sera representado ni con un 0 */ 


    System.out.println("Los valores del array n son los siguientes: ");
    for (int i = 0; i < 12;i++) {
      System.out.println(num[i]);
        
    }
  }  
}  