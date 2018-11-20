import java.util.Scanner;
public class bandera {
  public static void main(String[] args) {

    //Creamos un array de caracteres con el nombre color y sus valores
    String[] color = {"rojo", "amarillo", "verde", "blanco", "azul", "negro"};

    //Nombre programa
    System.out.println("Generador aleatorio de banderas");
    
    //Creamos scanner para recogida de datos
    Scanner s = new Scanner(System.in);

    //Solicitamos numero de franjas
    System.out.print("¿Cuántas franjas quiere para la bandera? ");

    //Recogida de datos
    int franjas = Integer.parseInt(s.nextLine());
    
    System.out.println("--------------");
    
    //Bucle para generar las franjas introducidas
    for (int i = 0; i < franjas; i++) {

      //Mostrar un valor del array color generado por math.random
      System.out.println(color[(int)(Math.random() * 6)]);
      
      System.out.println("--------------");
    }
  }  
}  