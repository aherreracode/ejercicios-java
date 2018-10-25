public class ejercicio2 {
  public static void main(String[] args) {

    int carta = 0;

    int baraja = 0;

    String palo = " ";

    for(int i = 0; i<=1; i++){
      baraja = (int)(Math.random()*3) + 1;
      carta = (int)(Math.random()*13) + 1;
    }

    switch(baraja) {
      case 1:
      palo = "picas";
      break;
      case 2:
      palo = "corazones";
      break;
      case 3:
      palo = "diamantes";
      break;
      case 4:
      palo = "treboles";
      break;
      default:
    }  

    switch(carta) {
      case 1:
      System.out.println("La carta es A de "+palo);
      break;
      case 2:
      System.out.println("La carta es 2 de "+palo);
      break;
      case 3:
      System.out.println("La carta es 3 de "+palo); 
      break;
      case 4:
      System.out.println("La carta es 4 de "+palo);
      break;
      case 5:
      System.out.println("La carta es 5 de "+palo);
      break;
      case 6:
      System.out.println("La carta es 6 de "+palo);
      break;
      case 7:
      System.out.println("La carta es 7 de "+palo);
      break;
      case 8:
      System.out.println("La carta es 8 de "+palo);
      break;
      case 9:
      System.out.println("La carta es 9 de "+palo);
      break;
      case 10:
      System.out.println("La carta es 10 de "+palo);
      break;
      case 11:
      System.out.println("La carta es J de "+palo);
      break;
      case 12:
      System.out.println("La carta es Q de "+palo);
      break;
      case 13:
      System.out.println("La carta es K de "+palo);
      break;
      default:
    }
  }
}
  