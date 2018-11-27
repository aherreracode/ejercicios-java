//Busca minas
public class ejercicio7 {

  static final int VACIO = 0;
  static final int  MINA = 1;
  static final int TESORO = 2;

  public static void main(String[] args){

    int[][] cuadrante = new int[4][5];

    // Rellenar huecos con vacio
    for (int x = 0; x < 4; x++){

      for (int y = 0; y < 5; y++){

        cuadrante[x][y] = VACIO;
      }
    }
    
    //Asignar hueco a la mina
    int minax = (int)(Math.random()*4);
    int minay = (int)(Math.random()*3);   
    cuadrante[minax][minay] = MINA;


    //Asignar hueco a tesoro
    int tesorox, tesoroy;
    do {

      tesorox = (int)(Math.random()*4);
      tesoroy = (int)(Math.random()*3);   
  
    } while ((tesorox==minax)&&(tesoroy==minay));
    
    cuadrante[tesorox][tesoroy] = TESORO;

    boolean paso = true;

    do {
      //Muestra el cuadrante completo
      System.out.printf(" %5d %5d %5d %5d %5d\n",cuadrante[0][0],cuadrante[0][1],cuadrante[0][2],cuadrante[0][3],cuadrante[0][4]);
      System.out.printf(" %5d %5d %5d %5d %5d\n",cuadrante[1][0],cuadrante[1][1],cuadrante[1][2],cuadrante[1][3],cuadrante[1][4]);
      System.out.printf(" %5d %5d %5d %5d %5d\n",cuadrante[2][0],cuadrante[2][1],cuadrante[2][2],cuadrante[2][3],cuadrante[2][4]);
      System.out.printf(" %5d %5d %5d %5d %5d\n",cuadrante[3][0],cuadrante[3][1],cuadrante[3][2],cuadrante[3][3],cuadrante[3][4]);

      //Pedir valores de posición
      System.out.println("Introduzca coordenada de x(0-3):");
      int valorx = Integer.parseInt(System.console().readLine());

      System.out.println("Introduzca coordenada de y(0-4):");
      int valory = Integer.parseInt(System.console().readLine());

      //Comprueba si el usuario ha encontrado el tesoro/mina con los valores introducidos
      if (cuadrante[valorx][valory] == cuadrante[tesorox][tesoroy]){
        System.out.println("Has dado con el tesoro.");
        paso = false;
      }else if(cuadrante[valorx][valory] == cuadrante[minax][minay]){
        System.out.println("Has dado con la mina.");
        paso = false;
      }
      
      //En base a las valores introducidos comprueba los alrededores de alcance 1
      if(paso == true){

          //Selecciona la columna 
          for (int y = (valory -1); y <= ((valory -1)+2); y++){
          
            //Selecciona la fila
            for (int x = (valorx -1); x <= ((valorx -1)+2); x++){

              //Evita que se salga del cuadrante, convirtiendose en una esfera
              int posicionx = (x + 4)%4;
              int posiciony = (y + 5)%5;

              //Si en alguna posición encuentra mina
              if (cuadrante[posicionx][posiciony]==MINA){
                System.out.println("Tienes una mina cerca.");
              }
            }
          }
        }
    //Mientras que no se encuentre mina ni tesoro, sigue pidiendo posiciones      
    } while (paso == true);
  }
}