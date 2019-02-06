/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AO.ejercicio02;

import AO.ejercicio01.*;

/**
 *
 * @author 7300HQ
 */
public class Gato {
    
    private String nombre;
    private String raza;
    private int edad;

    public Gato(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + '}';
    }
    
    
}
