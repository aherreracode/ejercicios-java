public class ejercicio1 {
  public static void main(String[] args) {
 
    int[][] num = new int[3][6];
    
    num[0][0]=0;
    num[0][1]=30;
    num[0][2]=2;
    num[0][5]=5;
    num[1][0]=75;
    num[1][4]=0;
    num[2][2]=-2;
    num[2][3]=9;
    num[2][5]=11;
    
    System.out.println("-----------------------------------------------");
    System.out.println("Array num   col0  col1  col2  col3  col4  col5");
    System.out.printf("fil0       %5d %5d %5d %5d %5d %5d \n",num[0][0],num[0][1],num[0][2],num[0][3],num[0][4],num[0][5]);
    System.out.printf("fil1       %5d %5d %5d %5d %5d %5d \n",num[1][0],num[1][1],num[1][2],num[1][3],num[1][4],num[1][5]);
    System.out.printf("fil2       %5d %5d %5d %5d %5d %5d \n",num[2][0],num[2][1],num[2][2],num[2][3],num[2][4],num[2][5]);
    System.out.println("-----------------------------------------------");
 
  }
}