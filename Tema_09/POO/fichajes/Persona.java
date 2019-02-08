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
public class Persona {
    
    String DNI;
    String Nombre;
    int Edad;

    public Persona(String DNI, String Nombre, int Edad) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public Persona(String DNI, String Nombre) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Edad = 0;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    @Override
    public String toString() {
        String aux = "Nombre: " + this.Nombre +
                     "\nEdad: " + this.Edad +
                     "\nDNI: " + this.DNI 
                ;
        return aux;
    }

}
