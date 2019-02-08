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
public class Jugador extends Persona{
    
    private String posicion;
    private int valorFichaje = 0;
    
    
    public Jugador(String posicion, String DNI, String Nombre, int Edad) {
        super(DNI, Nombre, Edad);
        this.posicion = posicion;
    }

    public Jugador(String posicion, String DNI, String Nombre) {
        super(DNI, Nombre);
        super.Edad = 0;
        this.posicion = posicion;
    }

    public void setValorFichaje(int valorFichaje) {
        this.valorFichaje = valorFichaje;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getValorFichaje() {
        return valorFichaje;
    }

    @Override
    public String toString() {
        String aux = "Nombre: " + super.Nombre +
                     "\nEdad: " + super.Edad +
                     "\nDNI: " + super.DNI +
                     "\nPosicion: " + this.posicion +
                     "\nValor Fich: " + this.valorFichaje
                ;
        return aux;
    }
    
    
    
    
    
}
