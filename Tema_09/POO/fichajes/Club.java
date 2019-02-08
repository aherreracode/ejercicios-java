/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.fichajes;

import java.util.ArrayList;

/**
 *
 * @author 7300HQ
 */
public class Club {

    private String Nombre;
    private Persona clubPresi;
    private ArrayList<Jugador> Plantilla = new ArrayList<>();

    public Club(String Nombre) {
        this.Nombre = Nombre;
        this.clubPresi = clubPresi;
    }

    public void setClubPresi(String DNI, String Nombre, int Edad) {
        this.clubPresi = new Persona(DNI, Nombre, Edad);
    }

    public Persona getClubPresi() {
        return clubPresi;
    }

    public void añadirJugador(Jugador jugador) {

        boolean almacenar = true;

        for (Jugador e : Plantilla) {
            if (e.getDNI() == jugador.getDNI()) {
                almacenar = false;
                break;
            }
        }

        if (almacenar) {
            this.Plantilla.add(jugador);
        } else {
            System.out.println("El jugador ya existe.");
        }
    }

    public void mirarJugador(String DNI) {

        for (Jugador e : Plantilla) {
            if (e.getDNI() == DNI) {
                System.out.println(e);
            }
        }
    }

    public void extraerJugador(String DNI) {

        for (Jugador e : Plantilla) {
            if (e.getDNI() == DNI) {
                this.Plantilla.remove(e);
            }
        }
    }

    public void traspasarJugador(Club club, String DNI) {
        
        for (Jugador e : Plantilla) {
            if (e.getDNI() == DNI) {
                club.añadirJugador(e);
                this.Plantilla.remove(e);
                break;
            }
        }
    }

    @Override
    public String toString() {
        String aux = "Club: " + Nombre
                + "\nPresidente: \n" + clubPresi
                + "\nJugadores: \n" + Plantilla;
        return aux;
    }

    /*
    @Override
    public String toString() {
        return "Club{" + "Nombre=" + Nombre + ", clubPresi=" + clubPresi + ", Plantilla=" + Plantilla + '}';
    }*/
}
