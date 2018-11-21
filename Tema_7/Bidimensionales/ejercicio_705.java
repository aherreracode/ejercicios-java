public class ejercicio5 {
  public static void main(String[] args){

    int[][] num = new int[6][10];

    int maximo = 0;
    int maximoFil = 0;
    int maximoCol = 0;

    int minimo = 1002;
    int minimoFil = 0;
    int minimoCol = 0;


    for (int i = 0; i < 6 ;i++){
      for (int x = 0; x < 10 ;x++){
        num[i][x]= (int)(Math.random()*1001);
        if (num[i][x] > maximo){
          maximo = num[i][x];
          maximoCol = x;
          maximoFil = i; 
        }
        if (num[i][x] < minimo){
          minimo = num[i][x];
          minimoCol = x;
          minimoFil = i;     
        }
      }
    }

    System.out.println("El numero maximo es "+maximo+" en la columna "+maximoCol+" y fila "+maximoFil);
    System.out.println("El numero minimo es "+minimo+" en la columna "+minimoCol+" y fila "+minimoFil);
  }
}