public class ejercicio2 {
  public static void main(String[] args) {

    //Creamos el array para caracteres, con el nombre "simbolo"
    char[] simbolo = new char[10];

    //Valores predefinidos del array
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[8] = 'Q';
    

    //En el array de caracteres se muestran todos los valores reservados "en blanco" en distinción del de integer
    System.out.println("El array caracter contiene los siguientes elementos:");
    
    //Bucle que recorre el array
    for (int i = 0; i < 10; i++) {
    System.out.println(simbolo[i]);
    }
  }  
}  