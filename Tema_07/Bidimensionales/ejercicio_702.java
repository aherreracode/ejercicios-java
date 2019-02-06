public class ejercicio2 {
  public static void main(String[] args) {
 
    int[][] num = new int[5][6];
    int numUser;

    for (int i = 0; i < 4 ;i++){
      for (int x = 0; x < 5 ;x++){
        System.out.println(" Introduzca el numero de la fila["+i+"] y columna["+x+"]");
        numUser = Integer.parseInt(System.console().readLine());
        num[i][x]=numUser;
        num[i][5] += num[i][x];   
      }
      num[4][5] += num [i][5];
    }

    System.out.println("-----------------------------------------------");
    System.out.printf("%5d %5d %5d %5d %5d Total_fil %5d \n",num[0][0],num[0][1],num[0][2],num[0][3],num[0][4],num[0][5]);
    System.out.printf("%5d %5d %5d %5d %5d Total_fil %5d \n",num[1][0],num[1][1],num[1][2],num[1][3],num[1][4],num[1][5]);
    System.out.printf("%5d %5d %5d %5d %5d Total_fil %5d \n",num[2][0],num[2][1],num[2][2],num[2][3],num[2][4],num[2][5]);
    System.out.printf("%5d %5d %5d %5d %5d Total_fil %5d \n",num[3][0],num[3][1],num[3][2],num[3][3],num[3][4],num[3][5]);
    System.out.printf("col0   col1  col2  col3  col4 Total_tab: %5d \n",num[4][5]);
    System.out.println("-----------------------------------------------");

  }
}