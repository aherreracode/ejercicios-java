/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.fichajes;

/**
 *
 * @author 7300HQ
 */
public class fichajes {

    public static void main(String[] args) {

        Club Munich = new Club("Munich");
        
        Club Bayern = new Club("Bayern");

        Jugador Juan = new Jugador("Defensa", "6523112A", "Juan", 13);

        Jugador Antonio = new Jugador("Delantero", "1234543A", "Antonio", 12);

        Jugador Pedro = new Jugador("Portero", "6556453A", "Pedro", 16);
        
        Munich.añadirJugador(Juan);
        
        Munich.añadirJugador(Antonio);

        Bayern.añadirJugador(Pedro);
        
        Munich.traspasarJugador(Bayern, "6523112A");
        
        Bayern.mirarJugador("12345A");
        
        Bayern.setClubPresi("1234567A", "Antonio",19);
        
        System.out.println(Bayern);
        
        System.out.println("- - - - - - - - ");

        System.out.println("Club Munich:");

        System.out.println("- - - - - - - - ");

        System.out.println(Munich);
        
    }

}
