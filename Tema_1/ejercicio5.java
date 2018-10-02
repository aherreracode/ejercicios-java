public class ejercicio5 {

 public static void main(String[] args) {

 String rojo = "\033[31m";
 String verde = "\033[32m";
 String naranja = "\033[33m";
 String azul = "\033[34m";
 String morado = "\033[35m";
 String blanco = "\033[37m";

  System.out.printf(" %-1s    %-1s     %-1s        %-1s     %-1s  \n","Lunes","Martes","Miercoles","Jueves","Viernes");

  System.out.printf(" %-11s   %-12s    %-11s       %-12s    %-12s \n",rojo + "SINF",verde + "PRO", blanco + "EED",blanco + "EED",rojo + "SINF");

  System.out.printf(" %-11s   %-12s    %-11s       %-12s    %-12s \n",rojo + "SINF",verde + "PRO", azul + "LM",verde + "PRO",rojo + "SINF");

  System.out.printf(" %-11s   %-12s    %-11s       %-12s    %-12s \n",rojo + "SINF",verde + "PRO", azul + "LM",verde + "PRO",rojo + "SINF");

  System.out.printf(" %-11s   %-12s    %-11s       %-12s    %-12s \n",naranja + "FOL",morado + "BBDD",verde + "PRO",morado + "BBDD",blanco + "EED");

  System.out.printf(" %-11s   %-12s    %-11s       %-12s    %-12s \n",naranja + "FOL",morado + "BBDD",verde + "PRO",morado + "BBDD",azul + "LM");

  System.out.printf(" %-11s   %-12s    %-11s       %-12s    %-12s \n",naranja + "FOL",morado + "BBDD",verde + "PRO",morado + "BBDD",azul + "LM");


 }
}
